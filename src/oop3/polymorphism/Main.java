package oop3.polymorphism;

import oop4.accessModifiers.A;

public class Main {
    // all the classes Shapes, Circle, Triangle and Sqaure(all these classes are hierarchical where Shapes is super class of all other shapes classes) are having same method area() so the representation is same but the reference and body are different
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        //there should be area() in Shapes class and if Sqaure class also has area()(method overridden) then first Sqaure class area() will be called because actual object is of Square
        Shapes square = new Square(); //whatever class members are accessed by 'square' must be defined in Shapes class. but the values of the members will depend on Square class.

        circle.area(); // this will call the area() of Circle class cuz the reference variable and actual object are both of Circle class
        square.area(); //this will call area() of Square class cuz actual object is of type Square and Square knows about the area() of Shapes class but vice-versa is not true

//        A obj = new A(10, "Zarna");
//        String name = obj.name; //this throws compile time error saying: 'name' is not public in 'oop4.accessModifiers. A'. Cannot be accessed from outside package
    }
}
