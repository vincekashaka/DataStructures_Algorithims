package com.vince.opp.abstractClass;

public abstract class Parent {

    int age;

    public Parent(int age) {
        this.age = age;
    }

    static void hello() {
        System.out.println("I am here guys");
    }

    void normal() {
        System.out.println("Hey i am a normal method");
    }
    abstract void career( );
    abstract void partner( );
}
