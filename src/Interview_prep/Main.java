package Interview_prep;

import java.util.Arrays;

public class Main {
//    int Sum( int arr[],int n){
//        return (n*(n+1))/2;
//    }
//    static int sumOfDigits(int N) {
//        // code here
//        int sum=0;
//        while(N>0){
//            int rem=N%10;
//            sum+=rem;
//            N=N/10;
//        }
//        return sum;
//    }
    static   void printPat(int n) {
        // Your code here
        for (int i = 0; i < n; i++) {
            for (int j = n; j > 0; j--) {
                for (int k = 0; k < n - i; k++) {

                    System.out.print(j + " ");


                }

            }
            System.out.println("$");
        }

    }

    public static void main(String[] args) {
//Write a program to find the sum of elements in an array
//        int arr[]={1,2,3,4,5};
//        int sum=0;
//        for(int i=0;i< arr.length;i++){
//            sum+=arr[i];
//
//        }
//        System.out.println(sum);
//        System.out.println(sum);
//        sumOfDigits(12);
//        System.out.println(sumOfDigits(12));
printPat(3);

    }
}



