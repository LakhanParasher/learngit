package oops;

public class oops_4 {
  public static class A{
        protected int num ;
       public   String name;
            protected       int arr[];

      public int getNum() {
          return num;
      }

      public String getName() {
          return name;
      }

      public void setNum(int num) {
          this.num = num;
      }

      public A(int num, String name) {
            this.num = num;
            this.name = name;
            this.arr = new  int [10];
        }
    }
    static  class b extends  A{

        public b(int num, String name) {

            super(num, name);
        }

    }
//    abstract classes
   static abstract  class shape{
      protected String name;

       public shape(String name) {
        this.name = name;
    }
    public  abstract  double calarea();
}
  static class  circle extends  shape{
      private double radius;

      public circle(String name, double radius) {
          super(name);
          this.radius = radius;
      }

      @Override
      public double calarea() {
          return Math.PI* radius*radius;
      }
  }
  static class rectangle extends shape{
      private  double length;
      private  double width;

      public rectangle(String name, double length, double width) {
          super(name);
          this.length = length;
          this.width = width;
      }

      @Override
      public double calarea() {
          return length*width;
      }
  }
    public static void main(String[] args) {
        A obj =new A(10,"lakhan");
        b obj1=new b(10,"lakhan");
          int n=obj1.num;
circle circle1=new circle("circle",5);
        System.out.println(circle1.calarea());
        rectangle rec=new rectangle("rectangle ",4,6);
        System.out.println(rec.calarea());


    }
    }

