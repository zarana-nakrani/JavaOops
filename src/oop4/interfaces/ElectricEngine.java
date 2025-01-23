package oop4.interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric Engine start");
    }

    @Override
    public void end() {
        System.out.println("Electric Engine stop");
    }

    @Override
    public void accelerate() {
        System.out.println("Electric Engine accelerate");
    }
}
