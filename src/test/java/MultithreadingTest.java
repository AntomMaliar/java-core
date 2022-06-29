import multithreading.FirstThread;
import multithreading.ThreadByImplementingRunnable;
import org.junit.Test;

public class MultithreadingTest {
    @Test
    public void createFirstThread(){
        FirstThread firstThread = new FirstThread();
        firstThread.start();
    }
    @Test
    public void createThreadByImplementingRunnable(){
        ThreadByImplementingRunnable myThread = new ThreadByImplementingRunnable();
        Thread t1 = new Thread(myThread);
        t1.start();
    }
}
