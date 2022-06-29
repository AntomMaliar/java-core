package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread extends Thread {
    static int a = 0;
    @Override
    public void run() {
        a++;
        System.out.println(Thread.currentThread().getName() + " a = " + a);
    }
}

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 7; i++) {
            MyThread thread = new MyThread();
            executor.execute(thread);//calling execute method of ExecutorService
        }
    }
}

