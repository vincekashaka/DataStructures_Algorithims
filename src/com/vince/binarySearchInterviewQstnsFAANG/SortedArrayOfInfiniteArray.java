package com.vince.binarySearchInterviewQstnsFAANG;

public class SortedArrayOfInfiniteArray {
    public static void main(String[] args) {
    int [] arr = {3, 5, 7, 9, 10, 90, 100,130, 140, 160, 170};
    int target = 10;
        System.out.println(asn(arr, target));
    }
    static int asn(int[] arr, int target){
        // firs find the range
        // start with a box of 2
        int start = 0;
        int end = 1;

        //condition for the target lie in the range
        while (target > arr[end]) {
            int temp = end + 1;
            //double the box value
            // end = previous end + sizeOfBox*2;
            end = end + (end - start + 1 ) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);

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
}
