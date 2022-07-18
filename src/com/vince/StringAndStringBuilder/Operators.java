package com.vince.StringAndStringBuilder;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println("a" + 3);

        System.out.println("Vince" + new ArrayList<>());
        System.out.println("Vince" + new Integer(17));
    }
}
