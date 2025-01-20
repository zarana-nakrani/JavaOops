package oop2.staticExample;

public class Main {
    public static void main(String[] args) {
        Human zarna = new Human(24, "zarna", 12000, 'B');
        Human vrundan = new Human(19, "vrundan", 15000, 'A');

        System.out.println(zarna.population); // prints 1 if the population is not declared as static. so every object is allocated seperate memory space for population variable.
        System.out.println(vrundan.population); // prints 2 if the population is declared as static so the variable is shared amoung objects and it will change for all objects if it is changed by one variable
        System.out.println(Human.population); // this also prints 2

//        greeting(); // throws compile time error: Non-static member greeting() cannot be referenced from a static context
        //static methods can only access other static members because they are shared by classes and if some class calls a static method and that static method is able to access non-static members than there will conflict in integrity.
        //non-static members are object dependent which are also accessible by other non-object dependent members which is not logical.
        //but non-static members can access static members because changes in them will reflect for all objects and there will be no integrity issue.
    }

    //this is not dependent on objects
    static void fun(){
        System.out.println("this is a static function"); //
        //greeting(); //you cant use this because it requires an instance but the function that you are using it in does not depend on an instance
        //greeting() can be accessed like this

        //you cant access non static members without referencing their instances in a static method.
        Main obj = new Main();
        obj.greeting();
    }

    //non-static method can call another non-static method because at the end anything will be accessed from main() which is static so there will be an object that is referencing any non-static method so eventually nesting non-static method is also being referred by an instance.
    void fun2(){
        greeting();
    }

    //non-static methods/variables belongs to an object
    void greeting(){
        System.out.println("Hello World!");
    }

}
