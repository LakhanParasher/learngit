package Multithreading;
class thread1  extends Thread {
    @Override

    public  void run() {
        while (true) {
            System.out.println("thread 1 is running ...");
        }
    }

} class thread2  extends Thread {
    @Override
    public  void run() {
        while (true ) {
            System.out.println("thread 2 is running ...");
        }

    }
}

public class Main  {

     public static void main(String[] args) {
        thread1 t1 =new thread1();
        thread2 t2 =new thread2();
        t1.start();
        t2.start();
//        System.out.println(thread.run());
      System.out.println("thread is running...");
    }
}
