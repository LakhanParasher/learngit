package corejava_revise;

import java.util.Arrays;
import java.util.Scanner;

public class day_6Array {
//    public static void reverseArray(int arr[], int start, int end){
//
//        while(start<=end){
//            int temp=arr[start];
//            arr[start]=arr[end];
//            arr[end]=temp;
//            start++;
//            end--;
//        }
//        public static void swapArray(int arr[], int index1, int index2){
//
//            int temp=arr[index1];
//            arr[index1]=arr[index2];
//            arr[index2]=temp;
//
//        }
//
// public static  int maxVal(int []arr){
//     int max=Integer.MIN_VALUE;
//     for(int i=0;i< arr.length;i++){
//         if(arr[i]>max){
//             max=arr[i];
//         }
//     }
//     return  max;
// }
//public static  int minVal(int []arr){
//     int min=Integer.MAX_VALUE;
//     for(int i=0;i< arr.length;i++){
//         if(arr[i]<min){
//             min=arr[i];
//         }
//     }
//     return  min;
//    static  int average(int arr[]){
//        int sum=0;
//        for(int i=0;i< arr.length;i++){
//            sum+=arr[i];
//        }
//        int avg=sum/arr.length;
//        return avg;
//    }


//    static class student{
//        public int roll_n0;
//        public String  name;
//        public int age;
//        public student(int roll_n0,String name,int age){
//            this.roll_n0=roll_n0;
//            this.name=name;
//            this.age=age;
//        }
//    }
//    public static  int countDistinct(int arr[], int n) {
//        int count=0;
//        boolean isDistinct = true;
//
//        for (int i = 0; i <n; i++) {
//            for (int j = i - 1; j >= 0; j--) {
//                if (arr[i] == arr[j]) {
//                    isDistinct = false;
//                    break;
//                }
//            }
//
//                if (isDistinct == true) {
//
//                    count++;
//
//                }
//                isDistinct=true;
//
//
//            }
//
//
//
//        return  count;
//
//    }
public  static  boolean isSorted(int arr[],int n){
    for(int i=1;i< n;i++){
        if(arr[i]<arr[i-1]){
            return  false;
        }
    }
    return true;
}
    public static void main(String[] args) {
////         Scanner sc=new Scanner(System.in);
////        System.out.println("Enter the elements of array ");
////         int n=sc.nextInt();
////
////         int arr[]=new int[5];
////         for(int i=0;i<n;i++){
////            arr[i]=sc.nextInt();
////         }
////        System.out.println("array elements are");
////for(int i=0;i<n;i++){
////   System.out.print(Arrays.toString(arr[i]));
////}
////        int arr[]=new int [3];
////        int x=10;
////        for(int i=0;i<arr.length;i++){
////            arr[i]=x;
////            x=x+10;
////            System.out.println(arr[i]);
////        }
////        int arr[];
////        arr=new int [5];
////        arr[0]=1;
////        arr[1]=4;
////        arr[2]=5;
////        arr[3]=7;
////        arr[4]=5;
//////        arr[5]=1;
////        for(int i=0;i<arr.length;i++){
////            System.out.println("elements of arrays "+i+" :"+arr[9]);
////        }
////     student[] arr=new student[4];
////     arr[0]=new student(1,"aman",13);
////     arr[1]=new student(2,"lakhan",14);
////     arr[2]=new student(3,"akash",15);
////     arr[3]=new student(14,"jay",13);
////
////for (int i=0;i< arr.length;i++){
////            System.out.println(arr[i].roll_n0+arr[i].name+arr[i].age);
////        }
////        Scanner sc=new Scanner(System.in);
////        System.out.println("Enter the size of array number is :");
////        int n=sc.nextInt();
////        int arr[]=new int[n];
////        for(int i=0;i<n;i++){
////            arr[i]= sc.nextInt();// user input of arrays
////        }
////        System.out.println("elements of array is :");
////        for(int i=0;i<n;i++){
////            System.out.print(arr[i]);
////
////
////        }
////        int sum=0;
////        for(int i=0;i<n;i++){
////            sum+=arr[i];
////
////        }
////
////        System.out.println(sum);
////        Scanner sc=new Scanner(System.in);
////
////        String [] str= new String[4];
////        String n =sc.next();
////        for(int i=0;i< str.length;i++ ){
////            str[i]= sc.next();
////        }
////        System.out.println(Arrays.toString(str));
////        basic of 2d arrays
////        Scanner sc=new Scanner(System.in);
////        int n= sc.nextInt();
////        int [][] arr=new int[3][2];
////        int [][] arr2d= {
////                {1,3,4},{2,3},{3,5,7}
////        };
////        for(int i=0;i< arr2d.length;i++){
////            System.out.println(arr2d[i]);
////        }
//
////        for(int row=0;row< arr.length;row++){
////            for(int col=0;col<arr[row].length;col++){
////                arr[row][col]= sc.nextInt();
////            }
////        }for(int row=0;row< arr.length;row++){
////            for(int col=0;col<arr[row].length;col++){
////                System.out.print(arr[row][col]+" ");
////            }
////            System.out.println();
////      }
////        for (int row=0;row< arr.length;row++){
////            System.out.println(Arrays.toString(arr[row]));
////        }
////        1 reverse an array
////        int arr[]={1,2,3,4,5};
//////         for(int i= arr.length-1;i>=0;i--){
//////             System.out.print(arr[i]+" ");
//////         }
////        System.out.println("orignial array is "+Arrays.toString(arr));
////reverseArray(arr,0,4);
////        System.out.println("reverse arr"+Arrays.toString(arr));
////        int arr[]={1,2,5,4,8};
////        swapArray(arr,1,3);
////
////       System.out.println("swap arrays :" +Arrays.toString(arr));
////     3 max and minimum value
////        int []arr={1,8,4,22,5};
////        minVal(arr);
//        System.out.println(minVal(arr));

//       }
//        4 find average of the array
//        int arr[]={10,20,30,40};
//        average(arr);
//        System.out.println(average(arr));
//        5 count distinct elements
//        Scanner sc =new Scanner(System.in);
//        System.out.println("enter the num");
//        int n= sc.nextInt();
//        int arr[]=new int[n]; //size of arr
//        for(int i=0;i<n;i++){
//            arr[i]= sc.nextInt();
//        }
//        System.out.println(countDistinct(arr,n));
//  6 array is sorted or not
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num");
        int n = sc.nextInt();
        int arr[] = new int[n]; //size of arr
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
            boolean ans = isSorted(arr,n);
            if (ans == true) {
                System.out.println("yes");
            } else {
                System.out.println("not");
            }
        }


    }
