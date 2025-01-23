package oop5.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(20, "Vrundan");
        son.career();

        Daughter daughter = new Daughter("Zarna");
        daughter.career();
        daughter.partner();

//        Parent mom = new Parent(); // Throws compile time error: 'Parent' is abstract; cannot be instantiated
        //lunch is a static method. It cannot be overridden and to be called using abstract class name
        Parent.lunch();

        //this is valid cuz the members that will be referred will be of Child class and not parent class
        Parent child = new Son(0, "TBD");
    }
}
