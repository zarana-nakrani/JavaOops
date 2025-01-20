package oop2.singletonExample;

public class Main {
    public static void main(String[] args) {
//        Singleton obj = new Singleton(); // throws compile time error: 'Singleton()' has private access in 'oop2.singletonExample. Singleton'
        Singleton obj = Singleton.getInstance(); //since getInstance is static we dont need the object of Singleton class to access it.

        Singleton obj1 = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        //all 3 ref variables are pointing to same object
    }
}
