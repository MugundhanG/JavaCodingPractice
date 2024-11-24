package Concurrency.Threads;

public class Task2 implements Runnable {
    private final Object lock2;

    public Task2(Object lock) {
        this.lock2 = lock;
    }

    @Override
    public void run() {
        synchronized (lock2) {

            System.out.println(Thread.currentThread().getName() + " is running");

            try {
                System.out.println(Thread.currentThread().getName() + " is going to sleep for 2 seconds");
                Thread.sleep(2000);

                lock2.notify();
                System.out.println(Thread.currentThread().getName() + " is notified other thread in the waiting state");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + " is finished");
        }
    }


}
