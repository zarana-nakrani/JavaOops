package oop3.polymorphism;

//all the classes by default extends Object class
public class ObjectPrint {
    int num;

    public ObjectPrint(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "ObjectPrint{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(43);

        //we did not tell java to print the number we have passed in class constructor
        //so println will call valueof()
        //valueof() is calling obj.toString() but this class doesnt have toString() method implementation
        // so java will determine that super class of this class i.e Object class has the implementation of toString() and hence will call that method
        //But then we override the toString() in object class by defining it in this class
        //So java will determine at runtime that the obj has access to the method in subclass and hence it will call the overridden method
        System.out.println(obj); //this will
    }
}
