package corejava_revise;

import java.util.Arrays;

public class day_8linearSearch {
    static boolean search(String str, char target){
        if(str.length()==0){
            return false;

        }
        for (int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
    static int[] search2D(int [][] arr, int target){
        if(arr.length==0){
            return new int[] {-1,-1};
        }
        for(int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }

        }
        return new int[]{-1-1};
    }
    static  int max(int [][]arr) {
        int max = Integer.MIN_VALUE;
        if (arr.length == 0) {
            return -1;
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] >max) {
                    max = arr[row][col];
                }
            }

        }
        return max;
    }
    static int maximumWealth(int [][]accounts){
        int ans=Integer.MIN_VALUE;
        for(int person=0;person< accounts.length;person++){
            int sum=0;
            for(int account=0;account<accounts[person].length;account++){
                sum=sum+accounts[person][account];
            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
//        25 rotate array in right side
//        int []arr={1,2,3,4,5};
//        int n=3;//how much time you rotate this array
//        System.out.println("original array is ");
//        for(int i=0;i<arr.length;i++){
//            System.out.print((arr[i]+" "));
//        }
//        System.out.println();
//        for(int i=0;i<n;i++){
//            int last=arr[arr.length-1];
//            for(int j= arr.length-1;j>0;j--){
//                arr[j]=arr[j-1];
//
//            }
//            arr[0]=last;
//
//        }
//
//        System.out.println("after the rotate array is ");
//        for(int i=0;i< arr.length;i++){
//            System.out.print((arr[i]+" "));
//        }
//        26 rotate array in left side
//        int arr[]={1,2,3,4,5};
//        int n=2;
//        System.out.println("original array is:");
//
//        for(int i=0;i< arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        int j;
//        for(int i=0;i<n;i++){
//            int first=arr[0];
//            for ( j=0;j< arr.length-1;j++){
//                arr[j]=arr[j+1];
//
//
//
//                }
//            arr[j]=first;
//            }
//        System.out.println();
//        System.out.println("after rotation");
//for(int i= 0;i<arr.length;i++){
//
//    System.out.print(arr[i]+" ");
//    27 swap first and last element in an array
//    int []arr={1,2,3,4,5};
//    int n=arr.length;
//    int temp=arr[0];
//    arr[0]=arr[n-1];
//    arr[n-1]=temp;
//        System.out.println(Arrays.toString(arr));
//        String str="lakhan";
//        char target='m';
//        System.out.println(search(str,target));
//        int[][] arr = {{1, 2, 4, 7}, {11, 13, 43, 22}
//                , {34, 32, 9, 66}};
//        int target=43;
//        int []ans=search2D(arr,target);
//        System.out.println(Arrays.toString(ans));
//        System.out.println(max(arr));
//        28 richest customer wealth:
         int arr[][]={{1,2,3},{3,2,1}};
        int richest=maximumWealth(arr);
        System.out.println(richest);
    }
        }



