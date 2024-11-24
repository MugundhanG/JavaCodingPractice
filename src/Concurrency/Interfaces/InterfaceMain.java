package Concurrency.Interfaces;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class InterfaceMain {
    public static void main(String[] args) {
        //Runnable Interface
        //By using runnable interface, we can not retrieve any results
        Thread runnableThread = new Thread(new RunnableInterfacePractice());
        runnableThread.start();


        System.out.println("*******Print by Callable Interface*******");
        //Callable Interface
        //By using Callable Interface,we can retrieve result and handle checked exceptions

        // Create a thread pool with a single thread
        ExecutorService exeService = Executors.newSingleThreadExecutor();

        // Create a Callable task to calculate year
        Callable<Integer> callableThread = new CallableInterfacePractice(2024);

        // Submit the Callable task and receive a Future object
        Future<Integer> future = exeService.submit(callableThread);

        try {
            // Retrieve the result of the Callable task
            Integer year = future.get();
            System.out.println("Printing under Try Block: " + year);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Shut down the executor service
        exeService.shutdown();
    }
}
