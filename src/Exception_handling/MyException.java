package Exception_handling;

public class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        try {
            String name = "lakhan";
            if(name.equals("lakhan")){
                throw new Exception("name is lakhan");
            }

        }catch (MyException e){
            System.out.println("My Exception ");
        }catch (ArithmeticException e){
            System.out.println("arithmetic exception");
        }catch (Exception e){
            System.out.println("normal exception");
//            nested try -catch
            //outer try block
            try {
                //inner try block
                try {
                    System.out.println("going to divide by 0");
                    int a = 5 / 0;
                } catch (ArithmeticException f) {
                    System.out.println(f.getMessage());
                }
                try {
                    int arr[] = new int[5];
                    arr[5] = 10;
                } catch (ArrayIndexOutOfBoundsException f) {
                    System.out.println(f.getMessage());
                }
                System.out.println("other statement");
            }
            //catch block of outer try block
                catch (Exception f){
                    System.out.println("normal exception ");
                }
finally {
                System.out.println("this will run always ");
            }
        }
    }
}
