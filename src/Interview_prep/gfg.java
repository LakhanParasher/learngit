package Interview_prep;

import java.util.Scanner;

class gfg {
     public static int evenlyDivides(int N) {
         int count = 0;
         int temp = N;
         while (temp > 0) {
             int rem = temp % 10;

             temp = temp / 10;
             if (rem > 0 && N % rem == 0)
                 count++;


         }
         return count;
     }

     public static void fibonnciSeries(int count) {
         int a = 0;
         int b = 1;
//         int count =10;
         for (int i = 1; i <= count; i++) {
             int c = a + b;
             a = b;
             b = c;
         }

     }

static int reverseNum(int n){
         int r=0;
         while (n>0){
             int remainder =n%10;
             r=r*10+remainder;
             n=n/10;
         }
         return  r;
}
    static int print2largest(int arr[], int n) {
         // code here
         int max =arr[0];
         for(int i=0; i<n ;i++){
             if(max<arr[i]){
                 max =arr[i];
             }
         }
         int second = arr[0];
         for(int i=0;i<n ;i++){
             if (second<arr[i] && arr[i]!=max){
                 second =arr[i];
             }
         }
         return second;
     }
     static int[] findIndex(int a[], int N, int key)
     {
         //code here.
         int arr[]={-1,-1};
         int start=0;
         int end =N-1;
         while (start<=end){
             if (a[start] ==key && a[end]==key ){
                 arr[0]=start;
                 arr[1]=end;
                 return arr;

             }
             if (a[start]!=key ) start++;
             if (a[end]!=key) end--;

         }
         return arr;
     }
// swap a number
     static void swap(int a, int b){
         System.out.println("before swapping "+ a+ " "  +b );

         int temp = a;
         a=b;
         b=temp;
         System.out.println("after swapping ");
         System.out.println("a =" +a +" \n "+"b ="   +b);

     }

     public static void main(String[] args) {
         System.out.println("hello world");
//        System.out.println(evenlyDivides(12));
//
//        fibonnciSeries(10)
         int count = 10;
         System.out.println("Fibonacci series up to " + count + " numbers:");
         fibonnciSeries(count);
         int n =123;
         int reversenum= reverseNum(n);
//         System.out.println("original number"+n);
//         System.out.println("Reverse number "+reversenum);
         int arr[]={ 1, 2, 3, 4, 5, 5 };
//         int secondLargest =print2largest(arr,5);
//         System.out.println(secondLargest);
        int key =5;
        int result []= findIndex(arr,6,key);
         System.out.println(result);
         int a=5; int b=8;
          swap(a,b);
//         System.out.println(ans);
//         lcm
         Scanner sc = new Scanner(System.in);
         int num1=sc.nextInt();
         int num2=sc.nextInt();
         int gcd =Math.min(num1,num2);
         int ans=1;
         for (int i=1; i<=gcd;i++){
             if(num1%i==0&& num2%i==0){
                 ans=i;
             }
         }
         int lcm =(num1*num2)/ans;
         System.out.println(lcm);

     }
 }