package corejava_revise;

public class day_4 {
    public static void main(String[] args) {
//        numbers star pattern
//        16:simple number program
//        int n=5;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//
//        }
        //16
//         int n=5;
//         int k=1;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(k++ +" ");
//            }
//            System.out.println();
//
//        }
//        17 :12345
//            1234
//            123
//            12
//             1
//        int n=5;
//        for(int i=n;i>=1;i--){
//            for(int j=1;j<=i;j++ ){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//        18:
//        int n=5;
//
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 int sum=i+j;
//                 if(sum%2==0){
//                     System.out.print("1");
//                 }else{
//                     System.out.print("0");
//                 }
//             }
//             System.out.println();
//         }
//        19. pascal traingle
//        int n=4;
//
//        for (int i=0;i<=n;i++){
//            for(int space=i;space<n;space++){
//                System.out.print(" ");
//            }
//            int number =1;
//
//for(int j=0;j<=i;j++){
//    System.out.print(number+" ");
//    number=number*(i-j)/(j+1); // formula of combination of number factoria l ex ; 4c2 4*3/2*1=6
//}
//            System.out.println();
//        }
// 19. diamond pattern java
//        int n=4;
//        for(int i=1;i<=n;i++){
//            for(int space=i;space<n;space++){
//                System.out.print(" ");
//            }
//            for(int j=i;j>=1;j--){//1st half
//                System.out.print(j);
//            }
//            for(int j=2;j<=i;j++){ // 2nd half
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//for(int i=n;i>=1;i--){
//            for(int space=i;space<n;space++){
//                System.out.print(" ");
//            }
//            for(int j=i;j>=1;j--){
//                System.out.print(j);
//            }
//            for(int j=2;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//
// 20:
//     int n=5;
//    for(int i=1;i<=n;i++){
//     for(int j=1;j<=i;j++){
//        System.out.print(i);
//    }
//   System.out.println();
// }
//        21 :
//         int n=5;
//        for(int i=n;i>=1;i--){
//            for(int j=n;j>=i;j--){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//        22

//  int n=5;
//        for(int i=1;i<=n;i++){
//            for(int j=i;j>=1;j--){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//23
//        int n=5;
//        for (int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                int sum=i+j;
//                if(sum%2==0){
//                    System.out.print("1");
//                }else{
//                    System.out.print("0");
//                }
//            }
//            System.out.println();
//        }
//        24

//  int n=5;
//        for (int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//
//                if(j%2==0){
//                    System.out.print("0");
//                }else{
//                    System.out.print("1");
//                }
//            }
//            System.out.println();
//        }
// 25 diamond numeric pattern
//        int n=5;
//        for(int i=1;i<=n;i++){
//            for(int space=1;space<=i;space++){
//                System.out.print(" ");
//            }
//            for(int j=i;j<=n;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//        for(int i=n-1;i>=1;i--){
//            for(int space=1;space<=i;space++){
//                System.out.print(" ");
//            }
//            for(int j=i;j<=n;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//   26     alphabets pattern
//        int alphabets=65;
//        for(int i=1;i<=5;i++) {
//
//            for (int j = 0; j <= i; j++) {
//                System.out.print((char) (alphabets + j) + "");
//            }
//            System.out.println();
//        }
//        27:

//        int alphabets=65;
//        for(int i=1;i<=5;i++) {
//
//            for (int j = 0; j <= i; j++) {
//                System.out.print((char) (alphabets) + "");
//            }
//            alphabets++;
//            System.out.println();
//        }
//        28
//
//        int alphabets=65;
//        for(int i=5;i>=0;i--) {
//
//            for (int j = 0; j <= i; j++) {
//                System.out.print((char) (alphabets+ j) + "");
//            }
////            alphabets++;
//            System.out.println();
//        }
//        for(int i=1;i<=5;i++) {
//
//            for (int j =0; j <=i; j++) {
//                System.out.print((char) (alphabets+ j) + "");
//            }
////            alphabets++;
//            System.out.println();
//        }
//        29;
//        int alphabet=65;
//        for(int i=0;i<=5;i++){
//            for(int space=5;space>=i;space--){
//                System.out.print(" ");
//            }
//            for(int j=0;j<=i;j++){
//                System.out.print((char)(alphabet+j)+" ");
//            }
//            System.out.println();
//        }
//        30 Butterfly pattern
//        int n=4;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            int space=2*(n-i);
//            for(int j=1;j<=space;j++){
//                System.out.print(" ");
//            }
//            for(int k=1;k<=i;k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }  for(int i=n;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            int space=2*(n-i);
//            for(int j=1;j<=space;j++){
//                System.out.print(" ");
//            }
//            for(int k=1;k<=i;k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }//        31:solid rhombus
//        int n=5;
//        for(int i=1;i<=n;i++){
//            for(int space=1;space<=n-i;space++){
//                System.out.print(" ");
//            }
//            for (int j=1;j<=n;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        32
//        int n=5;
//        for(int i=1;i<=n;i++){
//            for(int space=1;space<n-i;space++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }
//        33 diamond pattern
        int n=5;
        for(int i=1;i<=n;i++){
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }for(int i=n;i>=1;i--){
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();// pattern question is enough for now so first week task
            //almost completed
        }
    }
}
