package com.vince.opp.generics.comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student vince = new Student(12, 77);
        Student jack = new Student(11, 89.88f);
        Student bob = new Student(3, 79.78f);
        Student peter = new Student(5, 99);
        Student leon = new Student(9, 83);
        Student jason = new Student(17, 76.77f);

        Student[] list = {vince, jack, bob, peter, leon, jason};

        System.out.println(Arrays.toString(list));

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
//
        if (vince.compareTo(jack) < 0) {
            System.out.println("Jack has nore marks than vince");
        }
    }
}

