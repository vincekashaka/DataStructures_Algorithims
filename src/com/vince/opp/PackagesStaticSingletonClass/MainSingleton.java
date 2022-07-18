package com.vince.opp.PackagesStaticSingletonClass;

public class MainSingleton {
    public static void main(String[] args) {
        SingletonExample obj = SingletonExample.getInstance();

        SingletonExample obj2 = SingletonExample.getInstance();

        SingletonExample obj3 = SingletonExample.getInstance();

        // all 3 ref variables are pointing to just one object
    }
}
