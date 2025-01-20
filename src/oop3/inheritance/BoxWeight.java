package oop3.inheritance;

//this class will be child class of Box class
public class BoxWeight extends Box {
    double weight;
    String color; //same variable exists in parent class as well
    BoxWeight(){
        //we dont need to write super() explicitly. it will call that Box() implicitly
        this.weight = -1;
    }

    BoxWeight(int weight){
        this.weight = weight;
    }

    BoxWeight(double l, double h, double w, double weight){
        super(l, h, w); //this will call constructor of Box class with 3 arguments
        //super keyword is used to call the constructor of class from which this class is derived from
        //For eg. there are 3 classes A, B and C & B is derived from A and C is derived from B so if I use super keyword in Class C then it will call the constructor of class B.

        //another usecase of 'super' keyword
        //if I have 2 instance variables of same name in both parent and child class but I want to use that variable which is in parent class then 'super' is used to refer the variable in parent
        //class
        this.color = super.color; //here 'this' is referring to the 'color' instance variable for the object of this class and 'super' is referring to 'color' instance variable of Box class
        this.weight = weight;
    }

    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }

    BoxWeight(BoxWeight other){
        super(other); //this is valid because object of BoxWeight has access to all variables of Box object. this will call the constructor with 1 argument of Box type
        //this is exactly like Box box4 = new BoxWeight(3, 4, 5, 20); where actual object is of BoxWeight type and the reference variable (where the object is passed) is of type Box
        weight = other.weight;
    }

    //Overriding static method is not possible\
    //@Override //this throws compile time error
    static void greetings(){
        System.out.println("I am in BoxWeight class. Greetings!");
    }
}
