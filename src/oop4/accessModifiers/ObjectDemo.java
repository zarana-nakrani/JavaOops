package oop4.accessModifiers;

public class ObjectDemo {

    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    //All the methods in Object Class that can be overridden
    @Override
    //hashCode() is used to convert reference variable value in some random unique number
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        //Upcasting obj type
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //below to methods are already covered
    @Override
    //finalize is called when garbage collection hits
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    //this is used to print the value of reference variable
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        //for understanding hashcode
//        ObjectDemo obj = new ObjectDemo(34);
//        System.out.println(obj.hashCode());

        ObjectDemo obj1 = new ObjectDemo(12, 7.8f);
        ObjectDemo obj2 = new ObjectDemo(12, 8.5f);

        //this checks whether 2 reference vars are pointing to the same object or no
        if(obj1 == obj2){
            System.out.println("Obj1 is equal to Obj2");
        }

        //equals() check if this 2 objects have same content or no. to check we will have to create our implementation cuz default equals() check if both num and gpa are same or no.
        // But we want to check only for num
        //this if condition will be true
        if(obj1.equals(obj2)){
            System.out.println("Obj1 is equal to Obj2");
        }
    }
}
