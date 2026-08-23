package Threads;

public class Threads {
    private int count=0;
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

    public void creatingThread(){
        CreateThread thread = new CreateThread();
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());

        SendEmailTask sendEmailTask=new SendEmailTask();
        sendEmailTask.run(); //this runs on main thread

        Thread worker = new Thread(sendEmailTask);
        worker.start(); //does task.run which is on worker thread
/*
Java Process
│
├── Main Thread
│      │
│      ├── creates SendEmailTask
│      │
│      ├── creates Thread object
│      │
│      └── calls worker.start()
│
└── Worker Thread
       │
       └── executes task.run()

*/

        //Runnable = "what should be done?"
        //Thread  =  "who executes that work?"

        //sendEmailTask is the work executed by worker


    }

    public void threadStatus() {
        try {
            Thread thread = new Thread(() -> {
                System.out.println("Worker: " + Thread.currentThread().getState());

                System.out.println("thread executing");
                try {
                    Thread.sleep(5000); // Pauses the current thread for exactly 5 seconds
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }


                System.out.println("Worker: " + Thread.currentThread().getState());

            });

            System.out.println("Main: " + Thread.currentThread().getState());

            System.out.println("Worker: "+thread.getState());
            System.out.println("Worker: "+thread.isAlive());
            thread.start();

            System.out.println("Before join");
            thread.join(); //without this main thread does not wait for the worker.
            //approximately 5 seconds pass
            System.out.println("After join");


            System.out.println("Worker: "+thread.getState());
            System.out.println("Worker: "+thread.isAlive());

        } catch (InterruptedException e) {
            // Restore interrupted status
            Thread.currentThread().interrupt();
            System.err.println("The sleep interval was interrupted.");
        }
    }

    public void multiThreadRaceCondition(){
        try {
            System.out.println(count);

            Thread thread1 = new Thread(() -> {
                for (int i = 0; i < 100000; i++) {
                    increment();
                }
            });

            Thread thread2 = new Thread(() -> {
                for (int i = 0; i < 100000; i++) {
                    increment();
                }
            });

            thread1.start();
            thread2.start();

            thread1.join();
            thread2.join();

            System.out.println(count); //The exact number isn't predictable.That's the race.
        }
         catch (InterruptedException e) {
            // Restore interrupted status
            Thread.currentThread().interrupt();
            System.err.println("The sleep interval was interrupted.");
        }
    }

    public synchronized void increment(){ //control access to shared resources.
        count++; //conceptually, it is three steps:READ → MODIFY → WRITE
    } //A critical section is the portion of code that accesses shared mutable state and must not be executed concurrently by conflicting threads.

    public void multiThreadObjects(){
        // lock is associated with the object.here race condition will not occur
        try {
            System.out.println(count);

            Thread thread1 = new Thread(() -> {
                for (int i = 0; i < 100000; i++) {
                    count++;
                }
            });

            thread1.start();
            thread1.join();

            System.out.println(count); //The exact number isn't predictable.That's the race.
        }
        catch (InterruptedException e) {
            // Restore interrupted status
            Thread.currentThread().interrupt();
            System.err.println("The sleep interval was interrupted.");
        }
    }

    public synchronized void decrement() {
        count--;
    }

    public void printCount() { //non-synchronized method
        System.out.println(count);
    }

    //Both methods icrement,decrement use the same object lock beacuse they are instance synchronized method
    //The lock is associated with c, not specifically with increment() or decrement().
    //the lock exists as part of the object, but synchronized methods like incremnet,decrement only holds/acquires it during its execution
    //The lock is associated with the object; a synchronized instance method temporarily acquires that object's lock while the method runs.
    //another thread can enter printCount() while another thread is inside increment().
    //That's why simply having one synchronized method doesn't automatically make the entire class thread-
}
