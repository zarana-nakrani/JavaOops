public class WrapperExample {
    public static void main(String[] args) {
        int a = 10; //primitive datatype variable --> stored in heap memory

        Integer num = 45; // Or Integer num = new Integer(45); both are same. It is simple integer but of object type and stored in heap memory
        A obj;

        for(int i = 0; i < 1000000; i++){
            obj = new A("random");
        } //every time the loop runs obj will be pointing to the new object in the heap memory. So older object that are not referenced bu any variables will be destroyed by garbage collectors for memory-management and finalize() will be called automatically

    }
}

class A{
    final int num = 10;
    String name;

    A(String name){
        this.name = name;
    }

    //this method will be called when garbage collector destroys any object of class A
    @Override
    protected void finalize() throws Throwable{
        System.out.println("Object is destroyed");
    }
}