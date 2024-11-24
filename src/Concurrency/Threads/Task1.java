package Concurrency.Threads;

public class Task1 implements Runnable {
    private final Object lock1;

    public Task1(Object lock) {
        this.lock1 = lock;
    }

    @Override
    public void run() {
        synchronized (lock1) {

            System.out.println(Thread.currentThread().getName() + " is running");

            try {
                System.out.println(Thread.currentThread().getName() + " is going to sleep for 2 seconds");
                Thread.sleep(2000);

                System.out.println(Thread.currentThread().getName() + " is going to wait and remain in waiting state until notified");
                lock1.wait();
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + " is finished");
        }
    }

}
