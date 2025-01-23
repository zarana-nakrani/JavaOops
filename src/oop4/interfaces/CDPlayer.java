package oop4.interfaces;

public class CDPlayer implements MediaPlayer{
    @Override
    public void start() {
        System.out.println("Music start");
    }

    @Override
    public void end() {
        System.out.println("Music stop");
    }
}
