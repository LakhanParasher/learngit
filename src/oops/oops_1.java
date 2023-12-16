package oops;

public class oops_1 {
//  private static   class  person {
//        public String name;
//        public int age;
//
//        public person(String name, int age) {
//            this.name = name;
//            this.age = age;
//
//        }
//
//        public int getAge() {
//            return age;
//        }
//
//        public String getName() {
//            return name;
//        }
//    }
//    static class dog{
//        public String name;
//        public  String breed ;
//
//public dog(String name, String breed){
//    this.name=name;
//    this.breed=breed;
//}
//
//    public void setBreed(String breed) {
//        this.breed = breed;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getBreed() {
//        return breed;
//    }
//}
//    public static class rectangle{
//        int length;
//        double breadth;
//        int height;
//        public  rectangle(int length, int breadth){
//            this.length=length;
//            this.breadth=breadth;
//            this.height=height;
//        }
//
//    public double getBreadth() {
//        return breadth;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//
//    public int getLength() {
//        return length;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
//
//    public void setBreadth(int breadth) {
//        this.breadth = breadth;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }
//    public double area(){
//            return length*breadth;
//    }
//    public double perimeter(){
//            return 2*(length+breadth);
//    }
//}
    public static class student{
        String name;
        int age;
        student(){
            System.out.println("this is default constructor ");

        }
        student(String n, int id){
           name=n;
           age=id;
        }
}
    public static void main(String[] args) {
//        1 Write a Java program to create a class called "Person" with a name and age attribute.
//        Create two instances of the "Person" class, set their attributes using the constructor,
//        and print their name and age.

//        person person1= new person("lakhan",22);
//        person person2=new person("raghav",22);
//        System.out.println(person1.name+ person1.age);
//        System.out.println(person2);
// Write a Java program to create a class called "Dog" with a name and breed attribute.
// Create two instances of the "Dog" class, set their attributes using the constructor and
// modify the attributes using the setter methods and print the updated values.
//dog dog1= new dog("puppy","desi");
//        System.out.println(dog1.breed+" "+dog1.name);
//
//dog1.breed="germankutta";
//        System.out.println(dog1.breed+" "+dog1.name);
//        Write a Java program to create a class called "Rectangle" with width and height attributes.
//        Calculate the area and perimeter of the rectangle.
//        rectangle rectangle1=new rectangle(2,8);
//        System.out.println(rectangle1.area());
//        3. method overloading

        student s=new student();
        System.out.println("\n this is default constructor\n:");
        System.out.println("the value of parmeter is "+s.name+" and  "+s.age);
    }
}
