package oop2.staticExample;

//this is a demo to show initialization of static variable
public class StaticBlock {
    static int a = 4;
    static int b;

    // will only run once when the first object is created i.e when the class is loaded for the first time
    static {
        System.out.println("I am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + ", " + StaticBlock.b); // prints a = 4, b = 20

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + ", " + StaticBlock.b); // prints a = 4, b = 23

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + ", " + StaticBlock.b); // prints a = 4, b = 23 --> static block wont run again. it runs only once when the first object is created
    }
}
