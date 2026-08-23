package Threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadManagement {

    public void threadManagement() throws ExecutionException, InterruptedException {
            ExecutorService executorService = Executors.newFixedThreadPool(4);
            //Suppose Task 1 finishes first.
           //Remember:The thread does NOT die.That's the whole point of a thread pool.
        //T1 finishes Task 1
        //        ↓
        //T1 asks:
        //"Is there another task?"
        //        ↓
        //Queue has Task 5
        //        ↓
        //T1 takes Task 5
            for (int i = 1; i <= 10; i++) {

                int taskNumber = i;

                Future<Integer> future= executorService.submit(() -> {
//                    System.out.println("Task " + taskNumber);
                    try {
                        if(taskNumber % 2 == 0){
                            System.out.println("started " + taskNumber +" running on " + Thread.currentThread().getName());
                            Thread.sleep(10000);
                            System.out.println("ended " + taskNumber +" running on " + Thread.currentThread().getName());

                        }else{
                            System.out.println("started " + taskNumber +" running on " + Thread.currentThread().getName());
                            Thread.sleep(2000);
                            System.out.println("ended " + taskNumber +" running on " + Thread.currentThread().getName());

                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    return taskNumber;
                });

                System.out.println(future.get());
            }//the task is handed to the executor.If a worker is available, it can take the task.If all workers are busy, the task waits in the queue.

        executorService.shutdown(); //Don't accept new tasks, but finish already submitted tasks.

    }

    public void nonDaemonThreads(){
            ExecutorService executor =
                    Executors.newFixedThreadPool(4);

            executor.submit(() -> {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                System.out.println("Task finished");
            });

    }

    //By default, the worker threads created by a normal ExecutorService thread pool are non-daemon threads.
    //The JVM doesn't exit while non-daemon threads are still alive.

    //                  JVM
    //                   │
    //        ┌──────────┴──────────┐
    //        │                     │
    //   Main Thread           ExecutorService
    //                              │
    //                       ┌──────┼──────┐
    //                       ↓      ↓      ↓
    //                      T1     T2     T3
    //                       │      │      │
    //                      Task   Task   Task
    //
    //
    //main finishes
    //      │
    //      ↓
    //Doesn't automatically kill workers
    //      │
    //      ↓
    //shutdown()
    //      │
    //      ↓
    //Workers finish existing tasks
    //      │
    //      ↓
    //Workers terminate
    //      │
    //      ↓
    //No non-daemon threads
    //      │
    //      ↓
    //JVM exits
}
