package oop4.interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
    //    car.PRICE; //throws compile time error: Reference to 'PRICE' is ambiguous, both 'Engine. PRICE' and 'Brake. PRICE' match
//        car.start();
//        car.accelerate();
//        car.brake();


        Engine truck = new Car();
        System.out.println(truck.PRICE); //here you can refer to PRICE cuz at runtime java knows which PRICE var to resolve as the object instance is of Engine class type and actual object is of type Car class
        //you can't do:
//        truck.brake(); // throws compile time error: Cannot resolve method 'brake' in 'Engine' cuz object instance should know at compile time what it is gonna refer and obj. ins. is of Engine class which doesn't have brake()
        //so obj. ins. cannot refer to it.


        //There's a lil problem here. We have start() end() method for both Engine and MediaPlayer, but Car class just implements it for Engine. But what if I create ref. ins. of MediaPlayer class and want to run start() and end() of that class
        //then I wont be able to do it

        MediaPlayer carMedia = new Car();
//        carMedia.start();
//        carMedia.end();

        //We can fix this by implementing class for each interface
        NiceCar car1 = new NiceCar();
        car1.start();//this will start engine
        car1.stop();
        //this will start and stop music
        car1.startMusic();
        car1.stopMusic();
        car1.upgradeEngine();
        car1.start();
    }
}
