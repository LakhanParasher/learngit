package Interview_prep;

import java.util.Arrays;

public class VarArgs {
//    when we use varargs we don't know how many inputs are giving .
    static void  fun( int ...v){
        System.out.println(Arrays.toString(v));
    }

    public static void main(String[] args) {
        fun(1,2,3,4,5,6);
    }
}
