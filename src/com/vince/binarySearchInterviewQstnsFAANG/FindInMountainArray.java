package com.vince.binarySearchInterviewQstnsFAANG;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 11, 4, 3, 2};
        int target = 10;
        int ans = search(arr, target);
        System.out.println(ans);

    }

    //Mountain Array
    static int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstSearch = orderAgnosticBS(arr, target, 0, peak);
        if (firstSearch != -1) {
            return firstSearch;
        }
        // try to search in second half
        return orderAgnosticBS(arr, target, peak+1, arr.length-1);

    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // we are in descending  part of the array
                // theis maybe the ans look for at left
                //this is not why end != mid -1;
                end = mid;
            } else {
                // you are in ascending part of the array
                start = mid + 1; // because we know that mid + 1 ele > mid ele
            }
        }
        // in the end, start == end and pointing to the largest because of the 2 checks above
        // start and end are trying to find the max ele abov ethe 2 checks hence, when you are ponting to thesame ele that is your max
        // at every point i  time for start and end they have the possible anwer tillthey point to the same value
        return start; // you can return end
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {

        //find whether the array is sorted in ascending or descending
        boolean isAsc;
        isAsc = arr[start] < arr[end];

        while (start <= end) {
            //find the middle element
            //  int mind = (start + end) / 2; // might be possible the (start + end) is out of integer bound
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
