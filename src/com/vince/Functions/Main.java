package com.vince.Functions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        sum();
//        int ans = sum2();
//        System.out.println(ans);
        int ans = sum3( 3 , 7 );
        System.out.println(ans);

    }

    // pass the value of numbers when you are calling the method amin
    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }
    // return value
    static int sum2 () {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1:");
        int num1 = in.nextInt();
        System.out.print ("Enter number 2:");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }
    static void sum () {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1:");
        int num1 = in.nextInt();
        System.out.print ("Enter number 2:");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }
}
