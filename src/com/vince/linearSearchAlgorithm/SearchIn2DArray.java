package com.vince.linearSearchAlgorithm;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1 ,32,79, 9},
                {10, 42, 3},
                {45, 65, 34, 7,},
                {51,89}
        };
        int target = 51;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }
    //Find max in the 2Darray
    static int max(int[][] arr ) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;

                }
            }
        }
        return max;

    }

    //Search a 2D array
    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length ; col++) {
                if (arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};

    }
}
