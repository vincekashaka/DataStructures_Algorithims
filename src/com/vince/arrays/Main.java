package com.vince.arrays;

public class Main {
    public static void main(String[] args) {
        //Q: store roll number
        int a = 69;
        // Q: store role string
        String name = "Vince";

        //Array syntax
        //datatype[] variable_name = new datatype[size];
        // store 5 roll numbers
//        int[] rolls = new int[5];
//        //or directly
//        int[] rolls2 = {2, 44, 55, 3, 6};

        int[] rolls; // declaration of array. rolls is getting defined in the stack
        rolls = new int[5]; // here the actual initialisation of object is being created in the memory (heap)
//        System.out.println(rolls[0]);

        String[] arr = new String[4];
        System.out.println(arr[3]);


    }
}
