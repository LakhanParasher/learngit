package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public  static  void printSquare(Integer x){
        System.out.println(x*x);
    }
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(5,8,20,30 ,6);
        l.stream().filter(x -> x%2==0);
       l.stream().filter(x -> x>10);
        l.stream().forEach(System.out::println);
        List<Integer>list=Arrays.asList(10,20,5,7);
//        now we have using static  method reference method of printsquare is referred to main class calling
        list.stream().forEach(Main::printSquare);
        // sum of array using by stream
        int arr[]={10,20,30};
        int sum =Arrays.stream(arr)
                .sum();
        System.out.println(sum);
        //max value by stream
        int arr1[]={10,20,30};
        int max=Arrays.stream(arr1)
                .max().
                getAsInt();
        System.out.println(max);
//        print first n natural number with given number :
        Stream.iterate(1,x -> x+1)
        .filter(x-> x.toString().contains("5"))
                .limit(10)
                .forEach(System.out::println);

    }
}
