package com.vince.opp.enums;

public class Basic {
    enum Week {
        // these are called enum constants
        // public static and final member
        // type is Week
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday


    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;

        for(Week day : Week.values()){
            System.out.println(day);
        }
    }
}
