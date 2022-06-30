package synchronization;
class SomeTask1{
    synchronized public void someMethod(){
        for (int i = 0; i < 6; i++){
            if(i == 3){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " = " + i);
        }
    }
    synchronized public void someMethod2(){
        for (int i = 0; i < 6; i++){
            System.out.println(Thread.currentThread().getName() + " = " + i);
            notify();
        }
    }
}

public class MethodWait {
    public static void main(String[] args) {
        SomeTask1 someTask1 = new SomeTask1();

        Thread t1 = new Thread("first"){
            @Override
            public void run() {
                someTask1.someMethod();
            }
        };

        Thread t2 = new Thread("second"){
            @Override
            public void run() {
                someTask1.someMethod2();
            }
        };

        t1.start();
        t2.start();
    }
}
