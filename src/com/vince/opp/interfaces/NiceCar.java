package com.vince.opp.interfaces;

public class NiceCar {
    private  Engine engine;
    private Media player = new CDPlayer();

    public NiceCar() {
        engine = new PetrolEngine();

    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start (){
        engine.start();
    }

    public void stop (){
        engine.stop();
    }

    public void startMusic (){
        player.start();
    }

    public void stopMusic (){
        player.stop();
    }

    public void upgradeEngine ( ){
         this.engine =  new ElectricEngine();
    }
}
