package BinarySearchInterviewQstnsFAANG;

public class FirstAndLastPositionInArray {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 7, 7,8,8};
        int target = 7;
//        int[] ans = searchRange(nums, target);
//        System.out.println(ans);

    }
    public  int[] searchRange(int[] nums, int target) {

        //check initial answer
        int[] ans = {-1, -1};
        //check for first occurrence of target;
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, true);
        }
        return ans;
        }

        // this funct returns just the index of value of target
    int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            //find the middle element
            //  int mind = (start + end) / 2; // might be possible the (start + end) is out of integer bound
            int mid = start + (end - start) / 2;

            if (target < nums[mid]){
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                //potential ans found
                ans =  mid;
                if (findStartIndex == true){
                    end = mid -1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

}
