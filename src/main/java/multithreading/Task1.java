package multithreading;

public class Task1 implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<5;i++){
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName() +" - "+ i);
        }
    }

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Thread t1 = new Thread(task1, "first thread");
        Thread t2 = new Thread(task1, "second thread");

        t1.start();
        t2.start();
    }
}
