package oop4.accessModifiers;

public class A {
    //if we declare 'num' as private we can access it only in this class and if we want to access it from diff class we need to create getter and setter method
    //from the security pov its not good idea to give direct access to data members
    private int num;
    //if no access modifier is specified that means we cannot access it outside this package. Eg we try to access 'name' in polymorphism package's Main file you can see the error there
    String name;
    protected int[] arr;

    //public means you can access it from any class and any package
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

     public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

    public void add(){
        this.num = num + 1;
    }


}
