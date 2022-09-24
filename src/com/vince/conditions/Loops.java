package com.vince.conditions;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // for loop
        // print numbers 1 to 5
//        for (int num = 1; num <=5; num++) {
//            System.out.println(num);
//        }

        // print numbers from 1 to n
//        int n = input.nextInt();
//        for (int num = 1; num <= n; num++) {
//            System.out.print(num + " ");
//            System.out.println(" hello Vince");
//        }

        // while loop
//        int num = 1;
//        while (num <= 5) {
//            System.out.println(num);
//            num ++;
//        }

        // do while loop
        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while (n <= 5);

    }
}
