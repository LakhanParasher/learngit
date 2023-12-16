package corejava_revise;

import java.util.Scanner;

public class day_2 {
//    public static int  factorialNumber(int n) { by recursion
//        if (n == 0 || n == 1) {
//            return n;
//        }
//        return n*factorialNumber(n-1);
//    }
//    prime number
//     static boolean isPrime(int n){
//        if(n==1){
//            return  false;
//        }
//        if (n==2||n==3)
//            return true ;
//        if(n%2==0||n%3==0)
//            return false;
//        for(int i=2;i*i<=n;i++){
//            if(n%i==0){
//                return  false;
//            }
//         for (int i=5;i*i<=n;i++){
//             if(n%i==0||n%(i+2)==0){
//                 return false;
//             }
//
//        }
//        return true;
//    }
//  public static  boolean isPrime(int n){
//        if(n==1)
//            return false;
//        for(int i=2;i*i<=n;i++){
//            if(n%i==0)
//               return false;
//
//        }
//        return true;
//    }
//    public static  void primeFactor(int n){
//for(int i=2;i<=n;i++){
//    if(isPrime(i)){
//        int x=i;
//        while (n%x==0){
//            System.out.println(i);
//            x=x*i;
//        }
//
//    }
//
//}
//    }
 public static void main(String[] args) {
//        int i=11;
//        do{
//            System.out.println("gfg");
//        }
//        while(i<10);
////            System.out.println("gfg");
//            i++;
//        int i=0;
//        for ( i=0;i<10;i++){
//            System.out.println("gfg");
//        }
//        System.out.println(i);
//        for (int i=0;i<5;i++){
//            if(i==3){
//                continue;
//
//            }
//            System.out.println(i);
//        }
//        int i=0;
//        while(i<3){
//
//            System.out.println("ye "+i);
//            if(i==2)
//            continue;
//            System.out.println("ye"+i);
//            i++;
//        }
//        write a table of no.
//    Scanner sc =new Scanner(System.in);
//        System.out.println("Enter the number");
// int n= sc.nextInt();
//    int i=1;
//        while(i<=10){
//            System.out.println(i*n);
//            i++;
//        }
//        for(int i=0;i<=10;i++){
//            System.out.println(i*n);
//        }
//        System.out.println(factorialNumber(5));
//     int fact=1;
//     int n=5;
//      for(int i=1;i<=n;i++){
//          fact=fact*i;
//
//      }
//     System.out.println(fact);
//     Scanner sc =new Scanner(System.in);
//   int gcd=1;
//     int lcm=1;

//     System.out.println("enter the first number is :");
//     int x= sc.nextInt();
//     System.out.println("Enter the second number is :");
//     int y= sc.nextInt();
//     for(int i=1;i<=x&&i<=y;i++){
//         if(x%i==0&&y%i==0)
//             gcd=i;
//     }
//     System.out.printf("gcd of %d and  %d is %d :",x,y,gcd);
//  by using while condition :
//      while(x!=y){
//          if(x>y){
//              x=x-y;
//          }else {
//              y=y-x;
//
//          }
//          System.out.println(x);
//      }
//     one more method
//      int n=Math.min(x,y);
//      for(int i=1;i<=n;i++){
//          if(x%i==0&&y%i==0){
//              gcd=i;
//          }
//
//      }
//     System.out.println(gcd);
//     lcm
//
//     for(int i=1;i<=x&&i<=y;i++){
//         if(x%i==0&&y%i==0){
//             gcd=i;
//         }
//         int lcm=(x*y)/gcd;
//         System.out.printf("%d and %d is %d",x,y,lcm);
//     }
//
//     System.out.println(isPrime(18));
//     fibnocci series simple way
//  int n=sc.nextInt();
//  if(n==0||n==1) {
//      System.out.println(1 + " ");
//      System.out.println(1);
//  }
//   else{
//         System.out.println(1+"");
//         System.out.println(1);
//      int a=0; int b=1 ;
////      int count=10;
//      for(int i=2;i<=n;i++){
//          int c=a+b;
//          System.out.println(c);
//          a=b;
//          b=c;
//      }
//  }
//
//Prime factorization
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     primeFactor(n);
     int n=1234;
     while(n>10){
         n=n/10;
//         System.out.println(n);
     }
     System.out.println(n);
        }
    }


