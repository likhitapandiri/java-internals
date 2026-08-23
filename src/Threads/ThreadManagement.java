package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadManagement {
    public void threadManagement(){
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

                executorService.submit(() -> {
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
                });
            }//the task is handed to the executor.If a worker is available, it can take the task.If all workers are busy, the task waits in the queue.

        executorService.shutdown();

    }
}
