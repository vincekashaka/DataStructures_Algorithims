package com.vince.Arrays;

public class MaxItem {
    public static void main(String[] args) {
        int[] arr = {3, 4, 55, 25, 67,44 };
        System.out.println(maxRange(arr, 0, 3 ));
        System.out.println(max(arr));
    }
    // imagine that the array has a start and end indexes
    static int maxRange(int[] arr, int start, int end) {
        //work on edge cases here, like array being null
        if (end > start) {
            return -1;
        }

        if (arr == null) {
            return -1;
        }

        int maxVal = arr[start];
        for (int i = start; i < end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    // imagine that the array is not empty
    static int max(int[] arr) {
        // if array is empty
        if (arr.length == 0) {
            return -1;
        }
        int maxVal = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
