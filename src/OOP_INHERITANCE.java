import com.sun.tools.javac.Main;

public class OOP_INHERITANCE {

     static class Animal{
           void eat(){
            System.out.println("Eating ");
        }
    }
     static class dog extends  Animal{
          void bark(){
            System.out.println("barking");
        }
 static  class babydog extends  dog{
              void weep(){
                   System.out.println("Weeping ");
              }
}

    public static void main(String[] args) {
//         dog dg =new dog();
//         dg.bark();
//
//       dog.babydog de= new dog.babydog();
//de.weep();
        babydog tuffy= new dog.babydog();


    }
}
    }