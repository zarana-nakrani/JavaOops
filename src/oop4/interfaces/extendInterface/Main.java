package oop4.interfaces.extendInterface;

public class Main implements B{
    //here we will have to implement both fun() and greet() since B is extending A and hence it will hve both methods in its scope

    @Override
    public void greet() {
        System.out.println("hii there");
    }

    @Override
    public void fun() {
        System.out.println("Implemented in main");
    }
}
