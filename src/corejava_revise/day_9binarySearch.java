package corejava_revise;

import static oops.oops_2.greet;

public class day_9binarySearch {
    static int binarySearch(int []arr,int target){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end =mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else {
               return mid;
            }
        }
        return -1;

    }
    static int celingNumber(int []arr, int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if (target>arr[mid]){
                start=mid+1;
            }else {
                return mid;
            }
        }
        return start;
    } static int floorNumber(int []arr, int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if (target>arr[mid]){
                start=mid+1;
            }else {
                return mid;
            }
        }
        return end;
    }
    public static void main(String[] args) {
// 1 simple binary search
        int arr[]={2,3,5,9,14,16,18};
        int target=15;
//        int ans=binarySearch(arr,target);
//        System.out.println(ans);
//        2 celing number in binary search
//        int ans=celingNumber(arr, target);
//        System.out.println(ans);
//      3  floor number
        int ans=floorNumber(arr,target);
        System.out.println(ans);
        greet();


    }
}
