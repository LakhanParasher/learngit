package Interview_prep;

import java.util.Arrays;
import java.util.Scanner;

public class array_day1 {
    static  void change(int []arr){
        arr[0]=99;

    }
    public static void main(String[] args) {
//        int[] arr = new int[5];
//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 30;
//        arr[3] = 40;
//        arr[4] = 50;
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("the element of the array is :" + Arrays.toString(arr));
//    input
   Scanner sc =new Scanner(System.in);
//     n =sc.nextInt();
//    for (int j=0;i<arr.length;i++){
//        arr[j]=sc.nextInt();
//    }
//    for (int j=0;j<arr.length;j++){
//        System.out.print(arr[j]+" ");
//    }
//}
            String[] str =new String[4];
            for(int j=0;j<str.length;j++){
                str[j]=sc.next();
            }
            for (int j=0;j<str.length;j++){
                System.out.println(Arrays.toString(str));
            }
            int []nums ={2,3,5,7,8};
        System.out.println(Arrays.toString(nums));
            change(nums);
        System.out.println(Arrays.toString(nums));
        }
    }

