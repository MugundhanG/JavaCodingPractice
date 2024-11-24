package Concurrency.Synchronization;

public class Count {
    int count = 0;

    synchronized void increment() {
        count++;
    }

    synchronized void decrement() {
        count--;
    }
}
