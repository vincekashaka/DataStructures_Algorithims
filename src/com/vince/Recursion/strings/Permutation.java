package com.vince.Recursion.strings;

import java.util.ArrayList;

public class Permutation {

    public static void main(String[] args) {
//        permutations("", "abc");
//        ArrayList<String> ans = permutationsList("", "abc");
//        System.out.println(ans);

        System.out.println(countPermutations("", "abcd"));

    }

    static void permutations(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            permutations(first + ch + second, up.substring(1));
        }
    }

    //iteration

    static ArrayList<String> permutationsList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        //local to this call
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            ans.addAll(permutationsList(first + ch + second, up.substring(1)));
        }

        return ans;
    }

    //Count number of permkutations
    static int countPermutations(String p, String up) {
        if (up.isEmpty()) {
           return 1;
        }

        char ch = up.charAt(0);
        int count = 0;
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
          count = count +  countPermutations(first + ch + second, up.substring(1));
        }

        return count;
    }
}
