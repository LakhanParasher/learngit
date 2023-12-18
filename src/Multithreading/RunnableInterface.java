package Multithreading;

public class RunnableInterface {
    static class runnable1 implements Runnable{
        @Override
        public void run() {
            System.out.println("thread 1 is running ");
        }
    }
    static class runnable2 implements Runnable{
        @Override
        public void run() {
            System.out.println("thread 2 is running ");
        }
    }
    public static void main(String[] args) {
        runnable1 t1=new runnable1();
        Thread gun1=new Thread(t1);

        runnable2 t2=new runnable2();
        Thread gun2=new Thread(t2);
        gun1.start();
        gun2.start();

    }
}
