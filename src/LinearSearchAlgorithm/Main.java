package LinearSearchAlgorithm;

public class Main {
    public static void main(String[] args) {
        int[] nums = {33, 24, 44, 1, 2, 37, 67, 56, 99, 89, 0, -4,};
        int target = 37;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
        System.out.println(linearSearch2(nums, target));
        System.out.println(linearSearch3(nums, target));

    }
    // return boolean
    static boolean linearSearch3(int[] arr, int target) {
        // check the edge
        if (arr.length == 0) {
            return false;
        }
        // run a for loop
        for (int element : arr) {
            // check the element at every index ifit is = target
            if (element == target) {
                return true;
            }
        }
        // this line will execute if none of the above statements executed
        // hence the target does not exit in the array
        return false;
    }

    //search the target and return the target itself
    static int linearSearch2(int[] arr, int target) {
        // check the edge
        if (arr.length == 0) {
            return -1;
        }
        // run a for loop
        for (int element : arr) {
            // check the element at every index ifit is = target
            if (element == target) {
                return element;
            }
        }
        // this line will execute if none of the above statements executed
        // hence the target does not exit in the array
        return Integer.MAX_VALUE;
    }

    //Search in the array: return the index if the item found
    // otherwise if the item not found return -1

    static int linearSearch(int[] arr, int target) {
        // check the edge
        if (arr.length == 0) {
            return -1;
        }
        // run a for loop
        for (int index = 0; index < arr.length ; index++) {
            // check the element at every index ifit is = target
            int element = arr[index];
            if(element == target) {
                return index;
            }
        }
        // this line will execute if none of the above statements executed
        // hence the target does not exit in the array
        return -1;
    }
}
