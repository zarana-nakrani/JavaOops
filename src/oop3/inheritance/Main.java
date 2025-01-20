package oop3.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box(); //calls a constructor with no arguments
//        System.out.println(box.l+", " + box.w + ", " + box.h);
//
//        Box box3 = new Box(2, 3, 4); //Calls a constructor with 3 arguments
//        System.out.println(box3.l+", " + box3.w + ", " + box3.h);
//
//        Box box1 = new Box(4); //Calls a constructor with 1 argument which is of type int
//        System.out.println(box1.l+", " + box1.w + ", " + box1.h);
//
//
//        Box oldBox = new Box(box3); //Calls a constructor with 1 argument which is of type Box
//        System.out.println(oldBox.h + ", " + oldBox.w + ", " + oldBox.l);

        BoxWeight boxW = new BoxWeight();
        System.out.println(boxW.l + ", " + boxW.weight);

        BoxWeight box2 = new BoxWeight(2, 3, 4, 5);
        System.out.println("Volume of Box: " + (box2.l*box2.h*box2.w) + ", Weight of the box: " + box2.weight);

        //here we are creating reference variable of type Box but the actual object is of type BoxWeight. So what instances of the class can be accessed depends on the type of reference variable.
        Box box4 = new BoxWeight(3, 4, 5, 20);
//        System.out.println(box4.h); // since box4 is of parent class type, it cannot access instance variables of child class even if it is actually referencing the object of child class type.
//        System.out.println(box4.weight); //this throws compile-time error: Cannot resolve symbol 'weight'

        //there are many variables in both parent and child classes
        //you are given access to variables that are in the ref type i.e BoxWeight
        //Hence you should have access to weight variable
        //this also means, that the once you are trying to access should be initialized
        //but here, the obj itself is of type parent class, how will you call the constructor of child class.
//        BoxWeight box5 = new Box(2, 3, 4); // throws compile time error
//        BoxWeight box5 = new BoxWeight(5);
//        BoxWeight box6 = new BoxWeight(box5);
//        System.out.println(box6.l);
//
//
        Box boxx = new BoxPrice(2, 3, 5, 10, 100);
        box4.greetings(); //static methods doesnot depend on objects so the output will from Box Class and not BoxWeight Class. So even if we put same greetings() in BoxWeight and
        // also the actual object is of type BoxWeight and reference variable being of Super Class the greetings() method will be called from super class only
        // So static method can be inherited but cannot be overridden i.e you can create same name static method in child class as that in parent class but the one in super class will only be called always
        System.out.println(boxx.getL()); //boxx reference variable can access all the members of BoxPrice class as well as Box class
    }
}
