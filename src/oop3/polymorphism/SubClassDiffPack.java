package oop3.polymorphism;

import oop4.accessModifiers.A;
import oop4.accessModifiers.SubClass;

public class SubClassDiffPack extends A {

    public SubClassDiffPack(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClassDiffPack obj = new SubClassDiffPack(10, "Zarna");
        //we declared arr[] as protected in A class and it can be accessed from subclass of A in the different package
        obj.arr[0] = 10;
        //SubClassDiffPack doesn't know anything about SubClass2 and hence it wont be able to access any of the members of SubClass2
        Subclass2 obj1 = new Subclass2(12, "Whatever");
        obj1.number = 10; // can acc


        //Note: the object instance of the subclass i.e SubClassDiffPack in a diff package can access the protected members in the super class
        //But the super class(i.e A) object instance cannot access its own protected members outside the package in which it is declared
        //This is because SubClassDiffPack knows it is extending class A but A doesn't know it is being extended by some class outside the package in which it resides.
        //If it would have been possible then it would simply be public cuz any object instance can access public members from anywhere
        //And you can put below 2 lines in any class(outside the package) regardless of it extending A and you will be able to access protected member which violates its rule
//        A objA = new A(12, "Anonymous");
//        objA.arr[0] = 13; // these throws compile-time error: arr' has protected access in 'oop4.accessModifiers. A'

        //instanceof method is used to check if any ref variable is object instance of a given class
        System.out.println(obj instanceof A);
        System.out.println(obj instanceof SubClassDiffPack);
        System.out.println(obj instanceof Object);

        //getClass() is the method used to get the data about the class
        //this method is final so cannot override it
        System.out.println(obj.getClass());
        System.out.println(obj.getClass().getName());

    }

}

class Subclass2 extends A{

    protected int number;
    public Subclass2(int num, String name) {
        super(num, name);
    }
}
