package interfaces;

public class car implements engine,brake{
    @Override
    public void start() {
        System.out.println(" i start like normal car");
    }


    @Override
    public void brake() {
        System.out.println("i brake like a normal car");

    }
    @Override
    public void acc(){
        System.out.println("i acc like a normal car");

    }
}
