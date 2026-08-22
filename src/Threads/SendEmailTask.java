package Threads;

public class SendEmailTask implements Runnable{
    @Override
    public void run() {
        System.out.println("Sending email...");
    }
}

//SendEmailTask
//     │
//     │ represents
//     ↓
//   TASK
//
//And separately:
//
//Thread
//   │
//   │ executes
//   ↓
//  TASK
//
//That's the design principle:
//
//TASK ≠ THREAD