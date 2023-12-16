package Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {


        Human lakhan = new Human(21, "lakhan");
//    Human twin =new Human(lakhan);
//    Human raghav =new Human(22, "raghav ");
        Human twin = (Human) lakhan.clone();
        System.out.println(twin.age+ " "+twin.name);
        System.out.println(Arrays.toString(lakhan.arr));
//        shallow copy
        lakhan.arr[0]=100;
        System.out.println(Arrays.toString(lakhan.arr));
    }
}