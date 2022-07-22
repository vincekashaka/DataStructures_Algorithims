package com.vince.opp.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new LinkedList<>();

        list1.add(44);
        list1.add(24);
        list1.add(41);
        list1.add(4);

        System.out.println(list1);
    }
}
