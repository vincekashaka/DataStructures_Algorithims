package com.vince.Recursion.parttens;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 2, 1};
        bubble(arr, arr.length -1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble( int[] arr, int row, int column){
        if (row == 0){
            return;
        }
        if (column < row){
            if (arr[column] > arr[column + 1]){
                //swap
                int temp = arr[column];
                arr[column] = arr[column + 1];
                arr[column + 1] = temp;

            }
            bubble(arr, row, column+1);
        } else {
            bubble(arr, row-1, 0);
        }
    }
}
