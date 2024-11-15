package Concurrency.Threads;

public class ThreadPractice extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            //Initially Printing i value
            System.out.println("Thread running: " + i);
            try {
                Thread.sleep(1000);
                System.out.println("Thread is paused for 1 second after printing " + i);// Pause the thread for 500 milliseconds
            } catch (InterruptedException e) {
                //If we got receive exception, that will catch here with its message
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}
