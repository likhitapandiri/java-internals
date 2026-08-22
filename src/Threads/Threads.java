package Threads;

public class Threads {
    public void threadFundamentals(){
        System.out.println("main thread");

        Thread worker = new Thread(()->{
            System.out.println("worker thread");
        });

        worker.start(); //start() = create/start a new thread → that thread executes run()
        worker.run(); //run() = just call a method → no new thread

        Thread worker2 = new Thread(()->{
            System.out.println("worker thread");
        });

        System.out.println("Before");

        worker2.start(); //Start another thread and let it execute the task.So main can continue immediately.

        System.out.println("After");
    }
}
