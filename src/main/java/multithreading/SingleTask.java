package multithreading;

public class SingleTask extends Thread{
    static int a = 0;

    @Override
    public void run() {
        while (a < 10){
            a++;
            System.out.println(Thread.currentThread().getName() + " = " + a);
        }
    }
}


class Main {
    public static void main(String[] args) {
        SingleTask t1 = new SingleTask();
        SingleTask t2 = new SingleTask();
        SingleTask t3 = new SingleTask();
        t1.start();
        t2.start();
        t3.start();
    }
}