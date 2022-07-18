package com.vince.BinarySearchInterviewQstnsFAANG;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] nums= {2, 3, 5, 9, 14, 16, 18};
        int target = 25;
        int ans = ceiling(nums, target);
        System.out.println(ans);

    }

    //Smallest number >= target;

    static int ceiling(int[] arr, int target){
        // what is the trget is grreater than the greatest number;
        if (target > arr.length) {
            return arr[0];
        }
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            //find the middle element
            //  int mind = (start + end) / 2; // might be possible the (start + end) is out of integer bound
            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //ans found
                return mid;
            }
        }
        return start;
    }
}
