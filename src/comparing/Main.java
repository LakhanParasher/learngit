package comparing;

public class Main {
    public static void main(String[] args) {
        student lak=new student(45,78.9);
        student jaideep =new student(42,88.5);
        if(lak.compareTo(jaideep)<0){
            System.out.println(lak.compareTo(jaideep));
            System.out.println("lak has more  marks  jaideep ");
        }
    }
}
