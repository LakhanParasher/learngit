package Cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {


        Human lakhan = new Human(21, "lakhan");
//    Human twin =new Human(lakhan);
//    Human raghav =new Human(22, "raghav ");
        Human twin = (Human) lakhan.clone();
        System.out.println(twin.age+ " "+twin.name);
    }
}