package Concurrency.Interfaces;

public class RunnableInterfacePractice implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            //Initially Printing i value
            System.out.println("Thread running using Runnable Interface: " + i);
            try {
                Thread.sleep(1000);
                System.out.println("Runnable Interface - Thread is paused for 1 second after printing " + i);// Pause the thread for 500 milliseconds
            } catch (InterruptedException e) {
                //If we receive exception, that will catch here with its message
                System.out.println("Runnable Interface - Thread interrupted: " + e.getMessage());
            }
        }
    }
}
