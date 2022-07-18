package com.vince.opp.Inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight( ) {
        this.weight = -1;
    }

//     @Override
//    static void greeting() {
//        System.out.println("Hey I am in Box class");
//    }
    public BoxWeight(BoxWeight other) {
        super(other);
        weight = other.weight;
    }
    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h); // call the parent class constructor
        // used to initialize values present in parent class
        this.weight = weight;
    }

}
