package Interview_prep;

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
         System.out.println("original number"+n);
         System.out.println("Reverse number "+reversenum);
     }
 }