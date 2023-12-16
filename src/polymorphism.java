public class polymorphism {

    int sum(int a, int b){
        return a+b;
    }
    int sum (int a, int b, int c){
         return a+b+c;

    }

    public static void main(String[] args) {
        polymorphism num= new polymorphism();
        num.sum(5,6,4);
        num.sum(3,4);
    }
}
