package Interview_prep;

import java.util.Scanner;

public class function {
//   static int sum(){
//        Scanner in =new Scanner(System.in);
//        System.out.println("Enter the Num1 ");
//        int num1 =in.nextInt();
//        System.out.println("enter the num2 ");
//        int num2 =in.nextInt();
//        int sum =num1+num2;
//        return sum;
//    }
    static String greet( ){
       String greeting ="hello, how are you?";
        return greeting ;


    }

    public static void main(String[] args) {
//        int ans= sum();
//        System.out.println(ans);
        String message =greet();
        System.out.println(message);
    }
}
