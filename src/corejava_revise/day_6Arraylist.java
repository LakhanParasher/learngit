package corejava_revise;

import java.util.ArrayList;
import java.util.Scanner;

public class day_6Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>(5);
//        list.add(5);
//        list.add(9);
//        list.add(52);
//        list.add(25);
//        list.add(225);
//        for(int i=0;i< list.size();i++){
//        System.out.println(list.contains(25));
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));
        }
            System.out.println(list);
        }
    }

