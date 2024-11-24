package Concurrency.Synchronization;

public class Subtractor implements Runnable {
    private Count count;

    public Subtractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i = 0; i < 15; i++) {
            count.decrement();
            System.out.println("Subtractor #" + i);
        }
    }
}
