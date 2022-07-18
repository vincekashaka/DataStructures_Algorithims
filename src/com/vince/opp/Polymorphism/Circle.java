package com.vince.opp.Polymorphism;

public class Circle extends Shapes{

    // this is run when obj of Circle is created
    // hence it is overriding the parent method
    @Override // this is called annotation
    void area() {
        System.out.println("Area is pi * r * r");
    }
}
