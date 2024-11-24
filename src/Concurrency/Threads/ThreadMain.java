package Concurrency.Threads;

public class ThreadMain {
    public static void main(String[] args) {

        Object lock = new Object();

//        ThreadPractice t = new ThreadPractice(); //Creating new thread;
//        t.start();//Start the thread execution using start method.

        Thread t1 = new Thread(new Task1(lock), "Task-1");
        t1.start();

        Thread t2 = new Thread(new Task2(lock), "Task-2");
        t2.start();

    }
}
