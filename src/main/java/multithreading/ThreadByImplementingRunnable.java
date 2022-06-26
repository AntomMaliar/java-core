package multithreading;

public class ThreadByImplementingRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("thread is running...");
    }
}
