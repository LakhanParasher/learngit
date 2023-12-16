import java.util.ArrayList;
import java.util.Arrays;

public class generics {
    static class myGenerics<T>{
        int value;
        private T t1;

        public myGenerics(int value, T t1) {
            this.value = value;
            this.t1 = t1;
        }

        public int getValue() {
            return value;
        }

        public T getT1() {
            return t1;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public void setT1(T t1) {
            this.t1 = t1;
        }
    }
    public class Custom_Arraylist {
        private int[] data;
        private static int DEFAULT_SIZE = 10;
        int initial_Size = 0;

        public Custom_Arraylist(int[] data) {
            this.data = new int[DEFAULT_SIZE];
        }

        public void add(int num) {
            if (isfull()) {
                resize();
            }
            data[initial_Size++] = num;
        }

        private boolean isfull() {
            return initial_Size == data.length;

        }

        private void resize() {
            int[] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }


        public int remove() {
            int removed = data[--initial_Size];
            return removed;
        }

        public int get(int index) {
            return data[index];
        }

        public int size() {
            return size();
        }

        public void set(int index, int value) {
            data[index] = value;
        }

              @Override
        public String toString() {
            return "Custom_Arraylist{" +
                    "data=" + Arrays.toString(data) +
                    ", initial_Size=" + initial_Size +
                    '}';
        }
    }

        public static void main(String[] args) {
            ArrayList list = new ArrayList<>();
//        list.add(23);
//        list.add(34);
//        list.add(54);
//        list.add(65);
            for (int i = 0; i < 14; i++) {
                list.add(2 * i);
            }
            System.out.println(list);
myGenerics<String> g1=new myGenerics(23,"lakhan");
String str = g1.getT1();
            System.out.println(str);
        }
    }


