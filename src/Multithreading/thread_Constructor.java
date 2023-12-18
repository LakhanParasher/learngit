package Multithreading;
class thread extends Thread{
    public  thread(String name){
        super(name);

    }

    @Override
    public void run() {
//        while (true) {
            System.out.println(" I am thread");
        }
//    }
}
public class thread_Constructor {
    public static void main(String[] args) {
thread t1=new thread("lakhan");
t1.start();
        System.out.println("the id of the thread is "+t1.getId());
        System.out.println("the id of the thread is "+t1.getName());
    }
}
