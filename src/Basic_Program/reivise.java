package Basic_Program;

import java.util.Arrays;
import java.util.Scanner;

public class reivise {
    public static void checkPrime(int n) {
        int m = 0, flag = 0;
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(n + "it is not prime number ");
        } else {
            for (int i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + "it is not prime number ");
                    flag = 1;
                    break;
                }

            }
            if (flag == 0) {
                System.out.println(n + "it is prime number");
            }
        }
//    }boo
//    static boolean isSorted(int[] arr) {
//        for (int i = 0; i < arr.length-1; i++)
        //
//                   if (arr[i] < arr[i - 1])
//                return false;
//
//        return true;


    }


    public static void main(String[] args) {
        //write a program all divisor of a number
        //i/p: 5
        //o/p:1 3 5 15
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the  number ");
//        int n=sc.nextInt();
//        for (int i=1;i<=n;i++){
//            if(n%i==0){
//                System.out.println(i);
//            }
//
//        }
        // write a program of gcd
        // i/p:a=10, b=15;
        //o/p:5
//        Scanner sc =new Scanner(System.in);
//        int a =sc.nextInt();
//        int b=sc.nextInt();
//        int n=Math.min(a,b);
//        int ans=1;
//        for(int i=1;i<=n;i++){
//            if(a%i==0&&b%i==0){
//                ans=i;
//                System.out.println(ans);
//            }
//
//        }
        // write a program of LCM
//
        //write a program of factorial number
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
//
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
//        }
            System.out.println(fact);
// Check for prime number


//            checkPrime(8);
//            checkPrime(7);
//        sum of array elemtents
//
//        Scanner sc =new Scanner(System.in);
//        System.out.println("enter the number ");
//        int n= sc.nextInt();
//        int []arr=new int[n];
//        System.out.println("enter the array elemts ");
//        for (int i=0;i< arr.length;i++){
//            arr[i]=sc.nextInt();
//
//        }
//        System.out.println("array elements are ");
//        for(int i=0;i<n;i++){
//            System.out.print(Arrays.toString(arr));
//        }
//        int sum=0;
//        for(int i=0;i< arr.length;i++){
//            sum=sum+arr[i];
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(sum);
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length-1;i++){
//                if(arr[i]==arr[j]){
//                    System.out.println("duplicate are found "+arr[j]);

//                }
//            }
//        }

//        int arr[] = {3, 5, 7, 1};
//        System.out.println(isSorted(arr));
        }
    }
}