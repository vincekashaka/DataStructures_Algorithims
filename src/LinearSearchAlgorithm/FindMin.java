package LinearSearchAlgorithm;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {33, 24, 44, 1, 2, 37, 67, 56, 99, 89, 0, -4,};
        System.out.println(min(arr));
    }
    //Find min number in the arr
    // Assume arr.length
    // return min value in the array
    static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if ( arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
