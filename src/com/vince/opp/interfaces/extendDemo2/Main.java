package com.vince.opp.interfaces.extendDemo2;

public class Main implements A, B {
    @Override
    public void fun() {

    }


    public static void main(String[] args) {
        Main main = new Main();
        A.greeting();
    }
  }

