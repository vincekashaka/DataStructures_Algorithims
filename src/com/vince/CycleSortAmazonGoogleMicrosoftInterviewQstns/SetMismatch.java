package com.vince.CycleSortAmazonGoogleMicrosoftInterviewQstns;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr ={2, 1, 4, 2, 6, 5};
        System.out.println(Arrays.toString(findErrorNums(arr)));

    }
    static int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] -1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            }else {
                i++;
            }
        }
        // CASE1: search for first missing element
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1){
                return new int[] {arr[index], index + 1};
            }
        }

        return new int[] {-1, -1};
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

}
