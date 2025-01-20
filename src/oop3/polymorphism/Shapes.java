package oop3.polymorphism;

public class Shapes {

    //if I make this method as 'final' no other method will be able to override it
    void area() {
        System.out.println("I am in shapes");
    }

    //Early Binding
//    final void area() {
//        System.out.println("I am in shapes");
//    }
}
