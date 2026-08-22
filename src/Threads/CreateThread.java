package Threads;

public class CreateThread extends Thread{

    @Override
    public void run() {
        System.out.println("Running...");
    }

    //you don't actually want to create a new type of Thread
    //You want to describe some work that should be done.
    //"SendEmail IS-A Thread."
    //The task is the work.The thread is the thing that executes the work.

    //But Java does not allow:
    //
    //class MyTask extends Thread, SomeOtherClass
    //
    //Java has single class inheritance.
    //
    //A class can extend only one class:
    //
    //class MyTask extends Thread
    //                    ↑
    //              already used
    //
    //So if you later need:
    //
    //class MyTask extends SomeBusinessClass
}
