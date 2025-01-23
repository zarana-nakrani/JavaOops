package oop4.interfaces.nested;

//2. But top-level interface or class has to be declared as public
public class A {
    //1.nested interface can be declared as public, protected or private
    public interface NestedInterface{
        boolean isOdd(int num);
    }
}

 class B implements A.NestedInterface{
     @Override
     public boolean isOdd(int num) {
         return (num & 1) == 1;
     }
 }
