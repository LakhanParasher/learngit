public class first {
    static int a=4;
    static int b;
    static{
        System.out.println(" this is the static block");
        b=a*5;
    }
    public static void main(String[] args) {
    first st=new first();
        System.out.println(st.a+ " " + st.b);
    }
}
