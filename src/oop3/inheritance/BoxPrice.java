package oop3.inheritance;

//here BoxPrice is derived from BoxWeight
public class BoxPrice extends BoxWeight{
    double cost;

    BoxPrice() {
        super(); //this will call the constructor of BoxWeight with no arguments
        this.cost = -1;
    }

    BoxPrice(BoxPrice other) {
        super(other); //calls the constructor of BoxWeight having same type of object as argument
        this.cost = other.cost;
    }

    BoxPrice(double l, double h, double w, double weight, double cost){
        super(l, h, w, weight);
        this.cost = cost;
    }

    BoxPrice(double side, double weight, double cost){
        super(side, weight);
        this.cost = cost;
    }


}
