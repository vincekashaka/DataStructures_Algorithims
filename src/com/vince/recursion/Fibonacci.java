package com.vince.recursion;

public class Fibonacci {
    public static void main(String[] args) {
//        System.out.println(fibo(6));

//        for (int i = 0; i < 11; i++) {
//            System.out.println(fiboFormula(i));
//        }
        System.out.println(fiboFormula(50));
    }
    static int fiboFormula(int n) {
        // use long instead
        return (int)(Math.pow(((1 + Math.sqrt(5)) /2), n) / Math.sqrt(5));
    }

    static int fibo(int n) {
        // base condition
        if (n < 2){
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }
}
