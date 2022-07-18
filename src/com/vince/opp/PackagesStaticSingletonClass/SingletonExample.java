package com.vince.opp.PackagesStaticSingletonClass;

public class SingletonExample {
    private SingletonExample() {
    }

    private static SingletonExample instance;

    public static SingletonExample getInstance(){

        //Check whether that one object  is created or not
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;

    }
}
