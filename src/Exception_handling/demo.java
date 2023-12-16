package Exception_handling;

public class demo {
    public static void main(String[] args) {
//        Main.divide(3,0);
        try{
            int arr[]=new int[5];
            arr[50]=10/0;
throw new Exception("just for fun");
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception"+e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array out of bound exception");
        }catch (Exception e){
            System.out.println("normal exception");
        } finally {
            System.out.println("this will execute always ");
        }
    }
}
