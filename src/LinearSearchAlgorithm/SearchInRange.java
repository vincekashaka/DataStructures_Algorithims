package LinearSearchAlgorithm;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {33, 24, 44, 1, 2, 37, 67, 56, 99, 89, 0, -4,};
        int target = 100;
        System.out.println(linearSearch(arr, target, 1, 6));
    }
    static int linearSearch(int[] arr, int target, int start, int end) {
        // check the edge
        if (arr.length == 0) {
            return -1;
        }
        // run a for loop
        for (int index = start; index <= end ; index++) {
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
