package Concurrency.Interfaces;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableInterfacePractice implements Callable<Integer> {
    private int year;

    public CallableInterfacePractice(int year) {
        this.year = year;
    }

    @Override
    public Integer call() throws Exception {
        int learningYear = 2022;
        for(int i = 2022; i<= year; i++) {
            System.out.println("Printing under overridden method: " + i);
            learningYear = i;
            Thread.sleep(500);
        }
        return learningYear;
    }
}
