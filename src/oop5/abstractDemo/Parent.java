package oop5.abstractDemo;


public abstract class Parent {

    int age;
    String name;
    Parent(String name){
        this.name = name;
    }
    abstract void career();
    abstract void partner();
    void pocketMoney(){
        System.out.println("$100/month");
    }

    static void lunch(){
        System.out.println("Lunch menu is fixed for all kids");
    }
}
