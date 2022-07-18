package com.vince.opp.PackagesStaticSingletonClass;

import com.vince.opp.AccessControl.A;

public class Subclass extends A {

    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass(12, "VInce");
        int n = obj.num;
    }
}

