package com.vince.Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
//        int ans = sum(1234);
        int ans = prod(1234);
        System.out.println(ans);
    }
    static int  sum(int n){
        if(n == 0){
            return n;
        }
        return (n % 10) + sum(n/10);
    }

    static int  prod(int n){
        if(n % 10 == n){
            return n;
        }
        return (n % 10) * prod(n/10);
    }
}
