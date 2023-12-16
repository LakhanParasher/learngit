package Cloning;
class abc{
    int x=30;

}
class b{
    int x=21;
}
public class A{

    public static void main(String[] args) {
//        shallow copy
        // creating an object of the class ABC
        // it will copy the reference, not value
        abc obj1=new abc();
       abc obj2 =obj1;
        // updating the value to 6
// using the reference variable obj2
obj2.x=10;
// printing the value of x using reference variable obj1
        System.out.println("The value of x " +obj1.x);
//deep copy
        b obj3=new b();
        b obj4 =new b();
        obj4.x=12;
        System.out.println("the value of x "+ obj3.x);
    }
}
