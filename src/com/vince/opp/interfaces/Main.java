package com.vince.opp.interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//
//        car.acc();
//        car.brake();
//        car.start();
//        car.stop();
        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();

    }
}
