package oop4.interfaces;

public interface Engine {

    //by default variables in Interfaces are final and static
    int PRICE = 20000; //This is same as 'final static int PRICE'

    //By default methods in Interface are static
    void start();
    void end();
    void accelerate();
}
