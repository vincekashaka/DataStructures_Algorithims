package com.vince.opp.PackagesStaticSingletonClass;

public class StaticBlock {
    static int a = 9;
    static int b;

    // will only run once, when the first object is created
    static {
        System.out.println("I am cool");
        b = a - 4;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 7;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

    }
}
