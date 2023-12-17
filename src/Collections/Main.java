package Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("lakhan");
        arrayList.add("kartik");
        arrayList.add("kunal ");
        arrayList.add("jaideep");
//        Traversing list through iterator
        Iterator itr= arrayList.iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }
            List<Integer> vector=new Vector();
            vector.add(21);
            vector.add(100);
            vector.add(90);
            vector.add(45);
            System.out.println(vector);
    }
}

