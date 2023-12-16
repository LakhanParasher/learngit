package corejava_revise;

import java.util.Scanner;

public class day_3 {
    public static void main(String[] args) {
//        pattern
//        1 *****
//          *****
//         Scanner sc =new Scanner(System.in);
        System.out.println("enter the numb");
//        int n=4;
////        int n= sc.nextInt();
//        for(int i=0;i<n;i++){
//            for (int j=0;j<n+1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//  2. right angle triangle pattern
//        int n=5;
//        for (int i=1; i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
// 3. Left-hand side traingle
//        int n=5;
//        for (int i=1; i<=n;i++){
//           for(int space=n-i;space>=1;space--){
//               System.out.print(" ");
//           }
//
//            for (int j=1;j<=i;j++){
//
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        4 pyramid pattern
//        int n=5;
//        for (int i=1;i<=n;i++){
//            for(int space=n-i;space>=1;space--){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        5 diamond shape pattern :
//        int n=5;
//         for (int i=1;i<=n;i++){
//           for(int space=n-i;space>=1;space--){ // for printing spaces
//                 System.out.print(" ");
//             }
//           for(int j=1;j<=2*i-1;j++){
//               System.out.print("*");
//           }
//             System.out.println();
//         }
//        for (int i=n-1;i>=1;i--){
//            for(int space=n-i;space>=1;space--){ // for printing spaces
//                System.out.print(" ");
//            }
//            for(int j=1;j<=2*i-1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        6 downward traingle :
//        int n=5;
//
//        for (int i=n-1;i>=1;i--){
//            for(int j=0;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        7 Reverse pyramid :
//        int n=5;
//        for (int i=0;i<=n-1;i++){
//            for(int space=0;space<=i;space++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<=n-1-i;j++){
//                System.out.print("* "+" ");
//            }
//            System.out.println();

//        }
//        8 right down mirror star pattern
//        int n=5;
//        for (int i=n;i>=1;i--){
//
//            for (int space=n;space>=i;space--){
//                System.out.print(" ");
//            }
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//
//
//            }
//            System.out.println();
//
//        }
//    9    Right angle pascal triangle
//        int n=8;
//        for (int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=n;i>=1;i--){
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        10. left hand pascal trainngle
//        int n = 8;
//        for (int i = 1; i <= n; i++) {
//            for (int space = i; space <n; space++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
//    for (int i=n;i>=1;i--){
//           for(int space =i;space<=n;space++){
//               System.out.print(" ");
//          }
//          for(int j=1;j<i;j++){
//              System.out.print("*");
//          }
//        System.out.println();
//      }
//     11.   sand Glass Star Pattern :
//        int n=5;
//        for(int i=n;i>1;i--){
//            for(int space=i;space<n;space++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }for(int i=1;i<=n;i++){
//            for(int space=i;space<n;space++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }
//        12. hallow triangle pattern
//         int n=8;
//         for (int i=1;i<=n;i++){
//             for (int space=i;space<n;space++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=(2*i)-1;j++){
//                 if(j==1||i==n||j==(2*i)-1){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//        13. hallow rectangle pattern :
//        int n=4, m=5;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=m;j++){
//                if(i==1||j==1||i==n||j==m){
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        14:down triangle hallow triangle
//        int n=8;
//    for (int i=n;i>=1;i--){
//         for (int space=i;space<n;space++){
//             System.out.print(" ");
//          }
//         for(int j=1;j<=(2*i)-1;j++){
//              if(j==1||i==n||j==(2*i)-1){
//                  System.out.print("*");
//              }else{
//                  System.out.print(" ");
//              }
//          }
//           System.out.println();
//      }
//        15 diamond star pattern hallow
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int space = n; space > i; space--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j < 2 * (i - 1); j++) {
                System.out.print(" ");

            }

            if (i == 1) {
                System.out.println(" ");
            } else {
                System.out.println("*");
            }
            System.out.println();

    }
    for (int i=n-1;i>=1;i--){
             for(int space=n;space>i;space--){
                 System.out.print(" ");
             }
        System.out.print("*");
             for(int j=1;j<=2*(i-1);j++){
                 System.out.print(" ");

             }
             if(i==1){
                 System.out.println(" ");
             }else {
                 System.out.println("*");
             }
             System.out.println();
         }
        }
}

