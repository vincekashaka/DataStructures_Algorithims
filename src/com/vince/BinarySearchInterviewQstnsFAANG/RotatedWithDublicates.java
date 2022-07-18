package com.vince.BinarySearchInterviewQstnsFAANG;

public class RotatedWithDublicates {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2 };
        int target = 6;
        System.out.println(findPivotWithDuplicates(nums));
        System.out.println(search(nums, target));

    }

    static int search(int[] nums, int target) {
        int pivot = findPivotWithDuplicates(nums);

        // if array is not rotated,
        if(pivot == -1) {
            //just do normal binary search
            return binarySearch(nums, target, 0,  nums.length -1);
        }
        // if pivot is found you have found the 2 ascending sorted arrays
        //3 cases
        if(nums[pivot] == target) {
            return pivot;
        }
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot-1);
        }
        return binarySearch(nums, target, pivot + 1, nums.length -1);
    }
    static int binarySearch(int[] arr, int target, int start, int end){

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
        return -1;
    }

    // this will not work in dublicate values
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            //4 cases over here
            if(mid < end && arr[mid] > arr[mid +1] ) {
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]) {
                return mid -1;
            }
            //if elements at middle, start, end are equal ..skip
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                //skip the duplicates
                // NOTE: what if these elements at start and end were the pivotes
                // check if start is pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                // check whether end is pivot
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }  // left side is sorted, so pivot should be in right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            }else {
                end = mid + 1;
            }
        }
        return -1;
    }
}
