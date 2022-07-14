package Recursion;

public class BinarySearcUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 56, 67, 88, 98};
        int target = 56;
        System.out.println(search(arr, target, 0, arr.length-1));

    }
    static int search(int[] arr, int target, int start, int end){
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target){
            return mid;
        }
        if (target < mid) {
            return search(arr, target, start, end-1);
        }
        return search(arr, target, mid + 1, end);
    }
}
