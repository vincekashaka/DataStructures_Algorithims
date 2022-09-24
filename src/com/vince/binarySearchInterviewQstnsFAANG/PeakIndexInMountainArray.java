package com.vince.binarySearchInterviewQstnsFAANG;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6,11, 4, 3, 2};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);

    }
    //Mountain Array
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid +1]) {
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
}
