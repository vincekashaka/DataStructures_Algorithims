package BinarySearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-18, -11, -4, 0, 3, 5, 15, 18, 20, 33, 43, 54, 56, 67, 77};
        int target = 77;
        int ans = binarySearch(arr, target);
        System.out.println(ans);


    }
    //return the index
    //return -1 if target does not exits
    static int binarySearch(int[] arr, int target){
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
        return -1;
    }
}
