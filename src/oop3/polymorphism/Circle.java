package oop3.polymorphism;

public class Circle  extends Shapes{

    //This method will be called when the actual object is of Circle type
    //hence this method is overriding the method in parent class
    @Override //this is annotation. this is added to check if the method is actually overridden.
    void area() {
        System.out.println("Area of circle is pie *  * r");
    }
}
