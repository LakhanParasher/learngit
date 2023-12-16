package comparing;

import java.util.ArrayList;

public class javaLambda_Expression {

    public static void main(String[] args) {
        int width =10;
        Drawable obj =new Drawable() {
            @Override
            public void method1() {
                System.out.println("this is the method1"+"\n"+width);
            }

        };
        obj.method1();

        ArrayList<Integer> arrayList=new ArrayList<>();
        for(int i=0;i<5;i++){
            arrayList.add(i+1);
        }
   arrayList.forEach((item) ->
        System.out.println(item*2));
        javaLambda_Expression fun=new javaLambda_Expression();
//fun.operate(5,2,sum);
        operation sum=(a,b)->(a+b);
        operation prod=(a,b)->(a*b);
        operation divide=(a,b)->(a/b);
    }
//    int sum(int a, int b){
//        return a+b;
//    }
private  int operate(int a, int b, operation op){
     return op.operation(a,b);

}
}
interface  operation{
    int operation(int a, int b) ;

    }
    interface  Drawable{
    void method1();

    }



