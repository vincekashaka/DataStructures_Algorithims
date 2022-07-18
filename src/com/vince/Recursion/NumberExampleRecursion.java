package com.vince.Recursion;

public class NumberExampleRecursion {
    public static void main(String[] args) {
        print(1);

    }
    static void print(int n) {
        if (n==5) {
            System.out.println(5);
            return;
        }
        System.out.println(n);

        // recursive call
        // every function call will  take some memory
        // tail recursion
        //this is the last function cal l
        print(n+ 1);
    }
}
