package comparing;

import java.util.ArrayList;

public class lambda_practice {
    public static void main(String[] args) {
        //java lambda expression with example :
        int width = 20;
        Drawable1 obj1 = () -> System.out.println("this is the draw" + " " + width);
        obj1.draw();
//java lambda expression with no parameters
        Sayable say = () -> " i have nothing to say";
        System.out.println(say.say());
        // with single parameter ;
        Message message = (name) -> "hello" + name;
        System.out.println(message.msg("lakhan"));

        Message message1 = (name) -> "hello" + name;
        System.out.println(message1.msg("raghav"));
        //Multiple parameters
        Calculator sum = Integer::sum;
        System.out.println(sum.cal(10, 20));


    Calculator subtract = ( a, b) -> (a - b);
        System.out.println(subtract.cal(30,20));
//multiple arguments with data type
Calculator mul=(int a, int b) ->(a*b);
        System.out.println(mul.cal(5,8));
        //java lambda expression with return or without return type:
        Addable sum1=(a,b)->(a+b);
        System.out.println(sum1.add(20,30));
Addable sum2 =(a,b)->{
    return (a+b);
};
    System.out.println(sum2.add(30,70));
    //lambda expression with for each loop;
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(23);
        arr.add(43);
        arr.add(56);
        arr.add(62);
        arr.forEach((n)->
            System.out.print(n)
        );
//         Multiple Statements


message person=(mess )->{
    String str1="I would like to say you,\n";
    String str2= str1+mess;
return str2;
};
        System.out.println("time is precious ");
}

}
//functional interfacee means which has only one abstract method
interface Drawable1{
    void draw();
}
interface Sayable {
    String say();
}
interface Message{
      String msg(String name);

}
interface Calculator {
    int cal(int a, int b);

}
interface Addable{
    int add(int a, int b);
}
interface  message{
    String say(String Mess);
}
