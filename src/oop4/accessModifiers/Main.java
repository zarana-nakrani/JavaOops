package oop4.accessModifiers;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    A objA = new A(10, "Zarna");
    //need to do a few things
    //1. access the data members
    //2. modify the data members

    objA.getNum();
    //If we see internal implementation of ArrayList, all of its data members are private and if we see to reset DEFAULT_CAPACITY we pass the value in constructor.
//    ArrayList<Integer> arr = new ArrayList<>();
//    arr.DEFAULT_CAPACITY; //throws compile time error cuz 'DEFAULT_CAPACITY' has private access in 'java. util. ArrayList'

    }

}
