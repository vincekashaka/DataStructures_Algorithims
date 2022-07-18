package com.vince.opp.interfaces;

public class CDPlayer implements Media {
    @Override
    public void start() {
        System.out.println("Hiphop music start");
    }

    @Override
    public void stop() {
        System.out.println("Hiphop music stopped");

    }
}
