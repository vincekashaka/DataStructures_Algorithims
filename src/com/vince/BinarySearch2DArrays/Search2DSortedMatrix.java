package com.vince.BinarySearch2DArrays;

import java.util.Arrays;

public class Search2DSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
//        int target = 37;
       System.out.println(Arrays.toString(search(arr, 44)));


    }
    static int[] search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length -1;
        //condition
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row, col};
            }
            if (matrix[row][col] < target) {
                row ++;
            } else {
                col--;
            }
        }
        return new int[]{-1, -1};
    }
}
