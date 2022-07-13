package BinarySearchInterviewQstnsFAANG;

public class FloorOfNumber {
        public static void main(String[] args) {
            int[] nums= {2, 3, 5, 9, 14, 16, 18};
            int target = 1;
            int ans = floor(nums, target);
            System.out.println(ans);
        }

        //greatest number <= target;

        static int floor(int[] arr, int target){
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
            return end;
        }
    }
