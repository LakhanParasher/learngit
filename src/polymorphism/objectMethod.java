package polymorphism;

public class objectMethod {
    int num;

    public objectMethod(int num) {
        this.num = num;
    }

//    public objectMethod() {
//        super();
//    }

    @Override
    public int hashCode() {
        return num;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }


    public static void main(String[] args) {
        objectMethod obj=new objectMethod(24);
        System.out.println(obj.hashCode());
    }
}
