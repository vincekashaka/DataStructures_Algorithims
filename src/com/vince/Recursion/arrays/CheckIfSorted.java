package com.vince.Recursion.arrays;

public class CheckIfSorted {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 9};
        System.out.println(sorted(arr, 2));
    }

    static boolean sorted(int [] arr, int index){
        // base condition
        if(index == arr.length -1) {
            return true;
        }
        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }
}
