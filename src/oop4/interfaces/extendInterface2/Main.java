package oop4.interfaces.extendInterface2;

public class Main implements A, B {
    //here we will have to implement both fun() and greet() since B is extending A and hence it will hve both methods in its scope
    //since fun() is default method in A I dont need to implement it here
    @Override
    public void greet() {
        System.out.println("hii there");
    }


    //Throws compile-time error:funA()' in 'oop4.interfaces. extendInterface2.Main' clashes with 'funA()' in 'oop4.interfaces. extendInterface2.A'; attempting to assign weaker access privileges ('private'); was 'protected'
//    private void funA() {
//
//    }
    @Override
    public void funA(){

    }
    // if we put same default fun() in B as well then again we are facing the same prblm we were trying to resolve using Interfaces. hence we are not allowed to put default methods on same name in 2 interfaces 1 class is implementing
    //throws compile time error: oop4.interfaces. extendInterface2.Main inherits unrelated defaults for fun() from types oop4.interfaces. extendInterface2.A and oop4.interfaces. extendInterface2.B

    public static void main(String[] args) {
        Main obj = new Main();
        A.greeting();
    }
}
