package Interview_prep;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();
//        right -triangle pattern
//        for (int i=0; i<n;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println( );
//        }
        //left side triangle :
//        for (int i=1;i<=n;i++){
//            for (int space=1;space<=n-i;space++){
//                System.out.print(" ");
//            }
//            for (int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        // Outer loop for number of rows
//        for (int i = 1; i <= n; i++) {
//            // Inner loop for printing spaces
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//
//            // Inner loop for printing asterisks
//            for (int k = 1; k <= i; k++) {
//                System.out.print("* ");
//            }
//
//            // Move to the next line after each row
//            System.out.println();
//        diamond -shape pattern
//        for (int i=1;i<=n;i++){
//            for (int space =1;space<=n-i;space++){
//                System.out.print(" ");
//            }
//            for (int j=1;j<=2*i-1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i=n-1;i>=1;i--){
//            for (int space =1;space<=n-i;space++){
//                System.out.print(" ");
//            }
//            for (int j=1;j<=2*i-1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        Reverse Pyramid Pattern:
//        for (int i=0;i<=n-1;i++) {
//            for(int space=0;space<=i;space++){
//                System.out.print(" ");
//            }
//            for (int j=0;j<=n-1-i;j++){
//                System.out.print("*"+ " ");
//            }
//            System.out.println();
//        }
// Right Pascale  side triangle:
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = n; i >=1; i--) {
//
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        left Pascal triangle:
//        for (int i=0;i<n;i++){
//            for(int space=i;space<n;space++){
//                System.out.print(" ");
//            }
//            for (int j=0;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }for (int i=n;i>=1;i--){
//            for(int space=i;space<n;space++){
//                System.out.print(" ");
//            }
//            for (int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i=1;i<=n;i++){
//            for(int space=i;space<n;space++){
//                System.out.print(" ");
//            }
//            for (int j=1;j<=(2*i)-1;j++){
//                if(j==1|| i==n||j==(2*i)-1){
//                    System.out.print("*");
//                }else {
//
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//        }
//
        int k=1;
 for (int i=1;i<=n;i++){
     for (int j=1;j<=i;j++){
         System.out.print(k++ + " ");
     }
     System.out.println();
 }
    }
}

