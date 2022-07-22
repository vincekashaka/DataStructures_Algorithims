package com.vince.opp.generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer>  arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
//            arr.add( i+i);
        }
//        arr.forEach((item) -> System.out.println(item * 2));
        Consumer<Integer> func = (item) -> System.out.println(item * 2);
        arr.forEach(func);

        Operation sum = (a, b) -> a + b;
        Operation prod = (a, b) -> a * b;
        Operation diff = (a, b) -> a - b;
        Operation div = (a, b) -> a / b;

        LambdaFunctions calculate = new LambdaFunctions();
        System.out.println(calculate.operate(5, 8, sum));
        System.out.println(calculate.operate(5, 8, prod));
        System.out.println(calculate.operate(5, 8, diff));
        System.out.println(calculate.operate(5, 2, div));
    }

    private int operate(int a, int b, Operation op){
        return op.operation(a, b);
    }
}

interface Operation {
    int operation(int a, int b);
}
