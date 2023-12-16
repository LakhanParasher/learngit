package oops;

public class oops_2 {
    public static void greet() {
        System.out.println("greeting");
    }

    void fun() {
        System.out.println("hello world ");
        greet();
    }

    static class human {
        int age;
        String name;
        int salary;

        public human(int age, String name, int salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

    }

    // inheritance concept all type of hands on practice
    static class employee {
        String name = "lakhan";
        int salary = 40000;
        ;

    }

    static class department extends employee {
        int bonus = 1000;


    }

    static class box {
        double length;
        double breadth;
        double height;

        box() {
            this.length = -1;
            this.breadth = -1;
            this.height = -1;

        }

        // cube
        box(double side) {
            this.length = side;
            this.breadth = side;
            this.height = side;


        }

        box(box old) {
            this.length = old.length;
            this.breadth = old.breadth;
            this.height = old.height;


        }

        public box(double length, double breadth, double height) {
            this.length = length;
            this.breadth = breadth;
            this.height = height;
        }

        public void information() {
            System.out.println("running the box ");
        }
    }

    static class boxweight extends box {
        double weight;

        public boxweight(double weight) {
            this.weight = weight;
        }
    }

    //single inheritance
    static class one {
        public void gfg() {
            System.out.println("geeks");
        }
    }

    static class two extends one {
        public void FOR() {
            System.out.println("for");
        }

    }

    static class three extends two {
        public void printgeeks() {
            System.out.println("geeks ");
        }
    }

    //    hierarchical
    static class a {
        public void printA() {
            System.out.println("class a");
        }
    }
        static class b extends a {
            public void printb() {
                System.out.println("class b");
            }
        }

        class c extends a {
            public void printc() {
                System.out.println("class c");
            }
        }

        class d extends a {
            public void printd() {
                System.out.println("class d");
            }
        }

        public static void main(String[] args) {

            human name = new human(21, "Lakhan", 4000);
//fun();
            department hr = new department();
            System.out.println("the department of hr salary is " + hr.salary + "\n" + "the bonus of " + hr.name + "" + hr.bonus);
            box box1 = new box();
            System.out.println(box1.length + " " + " " + box1.breadth + " " + box1.height);
            boxweight box2 = new boxweight(23.0);
            System.out.println(box2.height + " " + box2.weight + " ");
            box box3 = new boxweight(3);
            System.out.println(box3.length);
            three obj = new three();
            obj.gfg();
            obj.FOR();
            obj.printgeeks();
            b obj1 = new b();
            obj1.printA();
            obj1.printb();
        }
    }
