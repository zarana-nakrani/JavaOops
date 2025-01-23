package oop5.abstractDemo;
//Class 'Son' must either be declared abstract or implement abstract method 'career()' in 'Parent': error if I dont declare Son as abstract and dont implement abstract methods in Parent
public class Son extends Parent{

    Son(int age, String name){
        super(name);
        this.age = age;
    }

    @Override
    void career() {
        System.out.println("I want to become a doctor");
    }

    @Override
    void partner(){
        System.out.println("I love Zendaya");
    }
}
