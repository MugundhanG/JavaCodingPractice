package Concurrency.ExecutorServicePrac;
import java.util.concurrent.Callable;

//Practice with Callable Interface
public class ExeServiceCallable implements Callable<Integer> {
    private int bikeNumber;

    public ExeServiceCallable(int bikeNumber) {
        this.bikeNumber = bikeNumber;
    }

    @Override
    public Integer call() throws Exception {
        int bikeNum = 8540;

        for(int i = bikeNum; i <= bikeNumber; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        return bikeNumber;
    }
}



