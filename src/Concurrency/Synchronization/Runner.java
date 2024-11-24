package Concurrency.Synchronization;

public class Runner {
    public static void main(String[] args) {

        Count cnt = new Count();

        Thread adderThread = new Thread(new Adder(cnt));

        Thread subtractorThread = new Thread(new Subtractor(cnt));

        adderThread.start();
        subtractorThread.start();

        try {
            adderThread.join();
            subtractorThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Count value: " + cnt.count);


    }
}
