package corejava_revise;

import java.util.Scanner;

public class day_1 {
    public static void main(String[] args) {
//        System.out.println("Hello world");

//        swap two numbers;
//        int a =56;
//        int b=75;
//       a=a+b;
//       b=a-b;
//       a=a-b;
//        System.out.println("before swapping "+a+" "+b);
//        for(int i=0;i< args.length;i++)
//        System.out.println("there is only one men"+args[i]);
//        find the ap
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number a is :");
//        int a= sc.nextInt();
//        System.out.println("Enter the number n is :");
//        int n= sc.nextInt();
//        System.out.println("Enter the number d is :");
//        int d= sc.nextInt();
//
//        int ans=a+(n-1)*d;
//        System.out.println(ans);

//find out the gp term
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number a is :");
//        int a = sc.nextInt();
//        System.out.println("Enter the number r is :");
//
//        int r= sc.nextInt();
//        System.out.println("Enter the number n is :");
//        int n= sc.nextInt();
//        System.out.println();
//        int ans =a*(int)(Math.pow(r,n-1));
//        System.out.println(ans);
//       largest of three numbers:
//        Scanner sc=new Scanner(System.in);
//        int a= sc.nextInt();
//        int b= sc.nextInt();
//        int c= sc.nextInt();
//        if (a>=b&& a>=c){
//            System.out.println(" a is  largest number ");
//        }else if(b>=a&&b>=c){
//            System.out.println("b is largest");
//        }else {
//            System.out.println("c is largestt");
//        }
//        leap year or not
//        Scanner sc =new Scanner(System.in);
//        System.out.println("enter a year");
//        int year= sc.nextInt();
//        if (year%4==0&&year%100!=0){
//            System.out.println("this is leap year ");
//        }else if (year%400==0){
//            System.out.println("this is leap year ");
//        }else{
//            System.out.println("this is not a leap year ");
        Scanner sc =new Scanner(System.in);
        System.out.print(" select the operation\n:" +
                " 1.addition\n:" +
                "2.Subtraction\n:" +
                "3.Multiplication\n");
        int operation= sc.nextInt();
        if(operation!=1&&operation!=2&&operation!=3){
            System.out.println("invalid number");

            }
        else{
            System.out.println("enter the first number ");
            int a = sc.nextInt();
            System.out.println("enter the second number ");
           int  b= sc.nextInt();
           if (operation==1){
               System.out.println(a+b);
           }else if(operation==2){
               System.out.println(a-b);
           }else {
               System.out.println(a*b);
           }

        }
    }


}
