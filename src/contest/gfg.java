package contest;

import java.util.Scanner;

public class gfg {
//   static  int x=5;
//   static int y;
//   static {
//       System.out.println("inside block");
//       y=x*4;
//
//
//    }

    public static int calculateStringCost(String str){
        int totalCost=0;
        for(int i=0;i<str.length();i++){
            char c=Character.toLowerCase(str.charAt(i));
            if(isVowel(c)){
                totalCost+=1;

            }else if(isConsonant(c)){
                totalCost+=2;

            }else{
                totalCost+=3;
            }
        }
        return totalCost;

    }
    public static boolean isVowel (char c){
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';

    }
    public static boolean isConsonant(char c){
        c = Character.toLowerCase(c);
        return Character.isLetter(c) && !isVowel(c);
    }

    public static void main(String[] args) {
//        System.out.println("inside main");
//        System.out.println(x);
//        System.out.println(y);
        Scanner sc =new Scanner (System.in);
        int testCases= sc.nextInt();
        sc.nextLine();
        for (int i=0;i<testCases;i++){
            String str= sc.nextLine();
            int cost=calculateStringCost(str);
            System.out.println(cost);
        }

        sc.close();



    }
}


