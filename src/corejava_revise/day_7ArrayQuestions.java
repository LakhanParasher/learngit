package corejava_revise;

import java.util.Arrays;
import java.util.Scanner;

public class day_7ArrayQuestions {
    //    static int getSecondLargest(int []arr,int n){
//        for(int i=0;i< arr.length;i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//
//            }
//
//        }
//        return arr[n-2];
//
//    }
//    static int largest(int []arr) {
//        int max=0;
//        for(int i=0;i< arr.length;i++){
//            if(arr[i]>arr[max]){
//                max=i;
//
//            }
//        }
//        return max;
//
//    }
//    static  int lineaSearch(int[]arr,int target) {
//        if (arr.length == 0) {
//            return -1;
//        }
//        for (int index = 0; index < arr.length; index++) {
//            int element = arr[index];
//            if (element == target) {
//                return index;
//            }
//
//        }
//
//        return -1;
//    }
//    static int missingNum(int []arr){
//
//int n= arr.length+1;
//int sum1=(n*(n+1))/2;
//int sum2 = 0;
//        for(int i=0;i< arr.length;i++){
//            sum2+=arr[i];
//
//        }
//return  sum1-sum2;
//    }
//    static  boolean  isSorted(int []arr){
//        for(int i=1;i<arr.length;i++){
//
//                if(arr[i]<arr[i-1]){
//                    return false;
//                }
//            }
//
//
//        return true;
//
//     }
//    static int findMaxProduct(int []arr){
//        if(arr.length<2){
//throw new IllegalArgumentException("array should at least 2 elements ");
//        }
//        int max1=Integer.MIN_VALUE;
//        int max2=Integer.MIN_VALUE;
//        int min1=Integer.MAX_VALUE;
//        int min2=Integer.MAX_VALUE;
//        for(int num:arr){
//            if(num>max1){
//                max2=max1;
//                max1=num;
//            }else if(num>max2){
//                max2=num;
//            }
//            if(num<min1){
//                min2=min1;
//                min1=num;
//            }else if(num<min2){
//                min2=num;
//            }
//        }
//return Math.min(max1*max2,min1*min2);
//        }
//static int removeDuplicates(int []arr,int n){
//    int temp[]=new int[n];
//    temp[0]=arr[0];
//    int res=1;
//    for(int i=0;i<n;i++){
//        if(temp[res-1]!=arr[i]){
//            temp[res]=arr[i];
//            res++;
//        }
//    }
//    for(int i=0;i<res;i++){
//        arr[i]=temp[i];
//    }
//    return res;
//}
//optimize this code
//    static int removeDuplicates(int[]arr, int n){
//    int res=1;
//    for(int i=0;i<n;i++){
//        if(arr[i]!=arr[res-1]){
//            arr[res]=arr[i];
//            res++;
//        }
//    }
//    return res;
//    }
//    static int  palindrome(int n){
//        int rev=0;
//
//        while (n>0){
//            rev=rev*10+n%10;
//            n=n/10;
//
//        }
//        return rev;
//    }

    public static void main(String[] args) {
//        11 second largest no in an array
//        int arr[]={3, 15, 12, 18 ,4};
//        System.out.println(getSecondLargest(arr,5));
//
// 12 frequency count in an array
//        int []arr={1,2,8,3,2,2,2,5,1};
//        int [] freq=new int[arr.length];
//        int visited=-1;
//        for(int i=0;i< arr.length;i++){
//            int count=1;
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]==arr[j]){
//                    count++;
//                    freq[j]=visited;
//                }
//            }
//            if(arr[i]!=visited){
//                freq[i]=count;
//            }
//            System.out.println(arr[i]+" "+count);
//
//        }
//13 largest number in an array ;
//        int arr[]= {10, 5, 20, 8};
//        int maxind=largest(arr);
//        System.out.println(maxind);
//        14 linear search in an array :
//        int []arr={3,17,5,18,9,20};
//        int ans=lineaSearch(arr,20);
//        System.out.println(ans);
//    15    find missing number
//        int []arr={1,3,2,5};
//        int findnum=missingNum(arr);
//        System.out.println("missing number is "+findnum);
//        16 array is sorted or not :
//         int arr[]={7,20,30};
//
//         boolean ans=isSorted(arr);
//         if(ans==true){
//             System.out.println("yes");
//         }else{
//             System.out.println("not");
//         }
//        17 find max and min element
//        int []arr={1,24,8,12};
//        int min=Integer.MAX_VALUE;
//        int max=Integer.MIN_VALUE;
//        for(int i=0;i< arr.length;i++){
//            if(min>arr[i]){
//                min=arr[i];
//            }else if(max<arr[i]){
//                max=arr[i];
//            }
//        }
//        System.out.println("minimum num is "+ min);
//        System.out.println("maximum num is "+ max);
//        System.out.println(isSorted(arr));


//18 find common elements from array
//        int []arr={10,20,30,45,60};
//        int []arr1={5,7,20,45,10};
//        System.out.println("arr"+ Arrays.toString(arr));
//        System.out.println("arr1"+ Arrays.toString(arr1));
//        for(int i=0;i< arr.length;i++){
//            for(int j=0;j< arr1.length;j++){
//                if(arr[i]==arr1[j]){
//                    System.out.println("common elements both array "+arr[i]);
//break;
//                }
//            }
//        }
//        19. merge two arrays ;
//        int []arr= {1,2,3,4,5,6};
//        int []arr1={7,8,8,10,2,4};
//        int res[]=new int [arr.length+ arr1.length];
//        int pos=0;
//        for(int i=0;i< arr.length;i++){
//            res[pos]=arr[i];
//            pos++;
//
//        }
//        for(int j=0;j< arr1.length;j++){
//            res[pos]=arr1[j];
//            pos++;
//        }
//        System.out.println(Arrays.toString(res));
//        20 merge two array by desired order
//        int arr[]={1,3,4,5};
//        int arr1[]={6,7,8,9};
//        int length=arr.length+ arr1.length;
//        int res[]=new int[length];
//        for(int i=0;i<length;i++){
//            if(i%2==0){
//                res[i]=arr[i/2];
//
//            }else {
//                res[i]=arr1[i/2];
//
//            }
//        }
//        for(int num:res){
//            System.out.print(num+" ");
//        }
//        21 frequency count question revise;
//         int arr[]={1,2,1,1,2,2,3,4,6,6,6};
//         int freq[]=new int[arr.length];
//         int visit=-1;
//         for(int i=0;i< arr.length;i++){
//             int count =1;
//             for(int j=i+1;j< arr.length;j++){
//                 if(arr[i]==arr[j]){
//                     count++;
//                     freq[j]=visit;
//
//                 }
//
//                 }
//             if(freq[i]!=visit){
//                 freq[i]=count;
//             }
//             System.out.println(arr[i]+" " +count);
//         }
//        22 find the maximum product of two integers in an array
//        int[]arr={1,5,3,8,2};
//        int maxproduct=findMaxProduct(arr);
//        System.out.println(maxproduct);
//    23    remove duplicates from sorted array
//        int []arr={10,20,20,30,30,30,30};
//      int findDuplicates=removeDuplicates(arr,7);
//        System.out.println(findDuplicates+" ");
//        24 palindrome number
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the num is");
//        int n= 1225;
//        int reverse=palindrome(n);
//          if(n==reverse){
//                System.out.println(" palindrome number =yes");
//            }
//            else {
//                System.out.println(" palindrome number =no");
//            }
//        24 first and second largest number in an array
//        int []arr={10,5,250,100,95,45};
//        int first=0;
//        int second=0;
//        for(int i=0;i< arr.length;i++){
//            if(first<arr[i]){
//                second=first;
//                first=arr[i];
//
//            }else if(second<arr[i]){
//                second=arr[i];
//
//            }
//        }
//        System.out.println("first largest num is "+first);
//        System.out.println("second num is "+second);
//        }
//        25 sort 2d array
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array is:");
        int row= sc.nextInt();
        int col= sc.nextInt();
        int [][] arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println((arr[i][j]+" "));


                 }
            System.out.println();
            }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                for(int k=0;k< arr.length;k++){
                    for(int l=0;l<arr.length;l++){
                        if(arr[i][j]<arr[k][l]){
                            int temp=arr[i][j];
                            arr[i][j]=arr[k][l];
                            arr[k][l]=temp;
                        }
                    }
                }

            }
        }
        System.out.println("sorted 2d array ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
        }


}