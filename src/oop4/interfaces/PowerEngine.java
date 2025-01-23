package oop4.interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Power Engine start");
    }

    @Override
    public void end() {
        System.out.println("Power Engine stop");
    }

    @Override
    public void accelerate() {
        System.out.println("Power Engine accelerate");
    }
}
