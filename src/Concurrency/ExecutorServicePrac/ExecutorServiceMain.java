package Concurrency.ExecutorServicePrac;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceMain {
    public static void main(String[] args) {

        //USING RUNNABLE INTERFACE
        // Create a fixed thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(10);

        // Submit multiple tasks to the executor
        for(int i = 0; i < 5; i++) {
            ExecutorServicePractice exeServ = new ExecutorServicePractice("Learning");
            //The executor executes three tasks concurrently (based on pool size), and any remaining tasks wait in the queue.
            executor.submit(exeServ);
        }

        // Initiate a graceful shutdown of the executor
        //preventing new tasks from being accepted but allowing existing tasks to complete.
        executor.shutdown();

        //USING CALLABLE INTERFACE
        System.out.println("****Callable Interface with ExecutorService****");

        // Create a fixed thread pool with 5 threads
        ExecutorService executor2 = Executors.newFixedThreadPool(10);

        //// Submit a Callable task and get a Future object
        Future<Integer> result = executor2.submit(new ExeServiceCallable(8545));

        try {
            // Retrieve the result of the computation
            System.out.println("Future Object result: " + result.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Shut down the executor
        executor2.shutdown();
    }
}
