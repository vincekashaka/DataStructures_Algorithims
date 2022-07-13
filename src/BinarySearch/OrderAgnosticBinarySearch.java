package BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] arr = {-18, -11, -4, 0, 3, 5, 15, 18, 20, 33, 43, 54, 56, 67, 77};
        int[] arr = {99, 88, 67, 65, 4, 3, -2, -12};
        int target = -2;

        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);

    }
    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        //find whether the array is sorted in ascending or descending
        boolean isAsc;
        isAsc = arr[start] < arr[end];

        while (start <= end) {
            //find the middle element
            //  int mind = (start + end) / 2; // might be possible the (start + end) is out of integer bound
            int mid = start + (end - start) / 2;
            if (arr[mid] ==target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]){
                    end = mid - 1;
                } else  {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]){
                    end = mid - 1;
                } else  {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
