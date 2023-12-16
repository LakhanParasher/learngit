package Exception_handling;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
//            int c = a / b;
            divide(a,b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        }
        finally {
            System.out.println("this is always run at any cost ");
        }
    }
        static int divide(int a, int b) throws  ArithmeticException{
        if(b==0) {
            throw new ArithmeticException("please do not divide by zero");
        }
        return a/b;
    }
}
