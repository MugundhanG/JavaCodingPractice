package Concurrency.ExecutorServicePrac;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceMain {
    public static void main(String[] args) {

        //USING RUNNABLE INTERFACE
        // Create a fixed thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Submit multiple tasks to the executor
        for(int i = 0; i < 5; i++){
            ExecutorServicePractice exeServ = new ExecutorServicePractice("Learning");
            //The executor executes three tasks concurrently (based on pool size), and any remaining tasks wait in the queue.
            executor.submit(exeServ);
        }

        // Initiate a graceful shutdown of the executor
        //preventing new tasks from being accepted but allowing existing tasks to complete.
        executor.shutdown();

        //USING CALLABLE INTERFACE


    }
}
