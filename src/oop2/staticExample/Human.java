package oop2.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    char bloodgroup;
    //a single property or fact that is common to all human beings and if its changes it changes for everybody. It is independent of any human being. In general that property of class is object-independent.
    static long population;
    Human(int age, String name, int salary, char bloodgroup){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.bloodgroup = bloodgroup;
        Human.population += 1; //putting classname instead of 'this' is just a convention for static variables. i can use 'this' keyword instead of Human as well.
    }
}
