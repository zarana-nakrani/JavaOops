package oop4.interfaces;

//lets say you work at a car manufacturing company
//there are different types of car engines like diesel engine, electric engine, power engine etc--> all engines have different functions for start(), stop() and accelerate()
//there are different braking systems and different media players
//SO you make Engine, Brake and MediaPlayer Classes and then you make a CustomCar class which will have to have all the functionalities(i.e Engine, Brake and MediaPlayer)
public class Car implements Engine, Brake, MediaPlayer{

    @Override
    public void brake() {
        System.out.println("I Brake like a normal car");
    }

    @Override
    public void start() {
        System.out.println("I start engine like a normal car");

    }

    @Override
    public void end() {
        System.out.println("I stop engine like a normal car");

    }

    @Override
    public void accelerate() {
        System.out.println("I accelerate like a normal car");
    }
}
