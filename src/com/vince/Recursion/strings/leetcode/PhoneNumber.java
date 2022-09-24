package com.vince.Recursion.strings.leetcode;

import java.util.ArrayList;

public class PhoneNumber {

    public static void main(String[] args) {
//        pad("", "12");
        System.out.println(padList("", "12").size());
        System.out.println(padList("", "12"));

    }

    static void pad(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        // get the firs digit
        int digit = up.charAt(0) - '0'; // convert '2' into 2

        for (int i = (digit - 1)*3; i < digit * 3; i++){
            char ch = (char) ('a' + i);
            pad(p + ch, up.substring(1));
        }
    }

    // print as list
    static ArrayList<String> padList(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        // get the firs digit
        int digit = up.charAt(0) - '0'; // convert '2' into 2

        ArrayList<String> list = new ArrayList<>();

        for (int i = (digit - 1)*3; i < digit * 3; i++){
            char ch = (char) ('a' + i);
           list.addAll(padList(p + ch, up.substring(1)));
        }
        return list;
    }

    // TO DO: Return the count
}
