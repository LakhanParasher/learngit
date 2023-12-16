public class access_control {
    protected int num;
    String name;
    int[] arr;

    public access_control(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;


    }
}

 class subclass extends  access_control{
        public subclass(int num, String name){
            super(num, name);
        }



    public static void main(String[] args) {
        access_control obj=new access_control(5,"lakhan ");
       obj.setNum(23);
        obj.getNum();
        //subclass sb=new subclass();

    }
}

