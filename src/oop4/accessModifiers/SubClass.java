package oop4.accessModifiers;

//SubClass Also extends Object Class
//How: Class Object is the root of the class hierarchy. Every class has Object as a superclass. All objects, including arrays, implement the methods of this class.
//We can say that A extends Object and SubClass extends A which implies SubClass extends Object. Also SubClass cannot extend both A and Object at the same time since multiple inheritance is not allowed.
public class SubClass extends A{

    public SubClass(int num, String name) {
        super(num, name);
//        Object
    }

    public void getObj(){
        SubClass obj = new SubClass(10, "Zarna");
        obj.arr[0] = 10;
    }
}
