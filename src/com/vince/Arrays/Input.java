package com.vince.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // array of primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 13;
        arr[2] = 343;
        arr[3] = 33;
        arr[4] = 53;

        System.out.println(arr[2]);

        //input using for ;oop
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        System.out.println(com.vince.Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//
//        }
//
//        for (int num : arr) { // for every element in the array, print the element
//            System.out.println(num); // here num represent the array
//        }

        //array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        str[1] = "vince";
        System.out.println(Arrays.toString(str));

    }
}
