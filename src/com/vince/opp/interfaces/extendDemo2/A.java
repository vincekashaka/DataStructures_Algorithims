package com.vince.opp.interfaces.extendDemo2;

public interface A {
    // static interface methods should always have a body
    //call via the interface name
    static void greeting() {
        System.out.println(" I am cool with it");
    }
    default void fun() {
        System.out.println("I am in A");
    }
}
