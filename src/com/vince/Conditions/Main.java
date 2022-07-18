package com.vince.Conditions;

public class Main {
    public static void main(String[] args) {
        int salary = 1000;
//        if (salary > 1000){
//            salary = salary + 2000;
//        } else {
//            salary = salary + 1000;
//        }
        // multiple if-else
        if (salary > 10000) {
            salary += 2000;
        } else if (salary >20000) {
            salary += 3000;
        } else {
            salary += 1000;
        }
        System.out.println(salary);
    }
}
