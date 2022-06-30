package synchronization;
class SomeTask{
    int a;
     public void someWork() {
        for(int i = 0; i < 10; i++){
            a++;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " = " + a);
    }
    synchronized public void someWork2() {
        for(int i = 0; i < 10; i++){
            a++;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " = " + a);
    }
}

public class SynchronizationTest {
    public static void main(String[] args) {
        //before Synchronization
        SomeTask task1 = new SomeTask();
        Thread t1 = new Thread(){
            @Override
            public void run() {
                task1.someWork();
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                task1.someWork();
            }
        };

        t1.start();
        t2.start();
        //after Synchronization
        SomeTask task2 = new SomeTask();
        Thread t3 = new Thread(){
            @Override
            public void run() {
                task2.someWork2();
            }
        };
        Thread t4 = new Thread(){
            @Override
            public void run() {
                task2.someWork2();
            }
        };
        t3.start();
        t4.start();

    }
}
