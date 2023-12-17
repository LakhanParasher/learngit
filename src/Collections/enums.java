package Collections;
enum Level{
    low, medium ,high;
    Level(){
        System.out.println("Constructor called for "+this);
    }
}
public class enums {
    public static void main(String[] args) {
//   An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
        //enum using in switch statement  :
//      Level myvar = Level.low;
//     Level myvar1=Level.medium;
//       switch (myvar) {
//            case low -> {
//                System.out.println("low level");
//                break;
//            }
//
//            case medium -> {
//                System.out.println("medium level");
//                break;
//            }
//            case high -> {
//                System.out.println("high level");
//                break;
//            }

//        System.out.println(myvar);

// enum using for loop;
            for(Level a:Level.values()){
                System.out.println(a);
//            }
        }
    }
}

