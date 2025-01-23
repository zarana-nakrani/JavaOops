package oop4.interfaces;

public class NiceCar {
    private Engine engine;
    private MediaPlayer player = new CDPlayer();

    //default engine
    public NiceCar(){
        engine = new PowerEngine();
    }

    //custom Engine
    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    //now we have different implementation of start() and end() for Engine and MediaPlayer
    public void start(){
        engine.start();
    }

    public void stop(){
        engine.end();
    }

    public void startMusic(){
        player.start();
    }

    public void stopMusic(){
        player.end();
    }

    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }

}
