package oop4.interfaces.extendInterface2;

public interface A {
    default void fun(){
        System.out.println("I am in A");
    }

    //static interface method should always a body
//    static void greeting(); //Throws compile time error: Static methods in interfaces should have a body
    //Can be called using
    static void greeting(){
        System.out.println("Hello from Interface A");
    }

    //Lets say I have protected abstract method here --> Update protected is not allowed in Interfaces
    void funA();
}
