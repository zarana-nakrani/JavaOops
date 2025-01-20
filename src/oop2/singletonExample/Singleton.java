package oop2.singletonExample;

public class Singleton {
    //I want this class to have only one object
    //step 1: create 'private' constructor so it can be accessed in this class only and not even main method can access it if it is another class
    private Singleton() {

    }

    //Step 2: create a private variable of Singleton class type
    //Since instance is being used in getInstance() and that is static method, we need to make instance as static variable
    private static Singleton instance;

    //Step 3: create a public method that can create object instance only for once and return the same object whenever the method is called.
    //Note: we will have to create this method as static because it will be called from static method like main()
    public static Singleton getInstance(){
        //check if instance variable is not referencing any object yet. if it is, just return the same instance so the if the user is trying to create a new object reference of that class all the instance will be pointing to the same object in heap memory
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
