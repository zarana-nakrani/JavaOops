package oop5.abstractDemo;
//Class 'Son' must either be declared abstract or implement abstract method 'career()' in 'Parent': error if I dont declare Son as abstract and dont implement abstract methods in Parent
public class Daughter extends Parent{

    Daughter(String name){
        super(name);
    }
    @Override
    void career() {
        System.out.println("I want to become a coder");
    }

    @Override
    void partner(){
        System.out.println("I love Tom");
    }
}
