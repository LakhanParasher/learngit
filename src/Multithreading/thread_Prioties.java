package Multithreading;

public class thread_Prioties {
   static class thread extends Thread{
        public  thread(String name){
            super(name);

        }

        @Override
        public void run() {
            int i=32;
       while (true) {
            System.out.println("Thank You Jaan "+getName());
        }
   }

    }
    public static void main(String[] args) {
        Multithreading.thread t1=new Multithreading.thread("lakhan");
        Multithreading.thread t2=new Multithreading.thread("raghav ");
        Multithreading.thread t3=new Multithreading.thread("jaideep ");
        Multithreading.thread t4=new Multithreading.thread("Devops(most important)");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t4.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
//        System.out.println("the id of the thread is "+t1.getId());
System.out.println("the id of the thread is "+t1.getName());
        System.out.println(t2.getName());
        System.out.println(t3.getName());
        System.out.println(t4.getName());
    }
}
