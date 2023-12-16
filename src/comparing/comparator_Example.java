package comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class comparator_Example {

    public static void main(String[] args) {
        List<product> list=new ArrayList<>();
//        Adding products
        list.add(new product(1,"hp",30000));
        list.add(new product(2,"dell",40000));
        list.add(new product(3,"acer ",35000));
        System.out.println("sorting on the basis of name ");
        //implementing lambda expression:
        Collections.sort(list,(p1,p2)->{
            return p1.name.compareTo(p2.name);

        });
        for(product p :list){
            System.out.println(p.id +" "+p.name+" "+p.price);
        }
    }
}
class  product implements  Comparable <product>{
    int id;
    String name;
    float price;

    public product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(product o) {
        int diff= (int)(this.price-o.price);
        return diff;
    }
}
