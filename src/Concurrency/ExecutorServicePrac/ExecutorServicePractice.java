package Concurrency.ExecutorServicePrac;
import java.util.concurrent.*;

//Practice with Runnable Interface
public class ExecutorServicePractice implements Runnable {
    private String taskName;

    public ExecutorServicePractice(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println("Executing: " + taskName + " by " + Thread.currentThread().getName());
        try {
            Thread.sleep(3000); // Simulating a task by pausing for 3 second
        } catch (InterruptedException e) {
            System.out.println("Task interrupted: " + taskName);
        }
        System.out.println("Completed: " + taskName);
    }
}


