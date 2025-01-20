package oop3.inheritance;

//If I declare this class as 'final' no other class will be able to extend it. this will prevent inheritance
//Also all the methods in this class will be implicitly declared as final.
public class Box {
//    private double l; --> if I declare var l as private I cant access it directly from anywhere outside this class this is called data hiding. It is used to achieve encapsulation
    double l;
    double w;
    double h;
    String color;

     Box() {
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    //this method is used to get the value of private var l from outside this class
    public double getL(){
         return l;
    }
    //create cube;
    Box(double side){
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box(double l, double h, double w) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    //create new constructor out of old one
    Box(Box old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }

    static void greetings() {
        System.out.println("Hello! I am in Box class. Greetings!");
    }
}
