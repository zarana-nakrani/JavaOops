package oop2.staticExample;

public class NestedClasses {

    //this class has to be static if I want to access it from main() w/o creating the object of NestedClasses because main() cant access non-static members. And non-static members inside a class are dependent on object instances of the class they belong to. so I declare Test as non-static I need to access it using object of NestedClasses.
    static class Test {
        String name;

        Test (String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Zarna");
        Test b = new Test("Vrundan");

        System.out.println(a.name);
        System.out.println(b.name); //object 'a' and 'b' of Test class can have thier own identities, they are independent of objects of NestedClasses
    }


}
