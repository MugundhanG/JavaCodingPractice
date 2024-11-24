package Concurrency.Synchronization;

public class Adder implements Runnable {
    private Count count;

    public Adder(Count count) {
        this.count = count;
    }


    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            count.increment();
            System.out.println("Adder #" + i);
        }
    }
}
