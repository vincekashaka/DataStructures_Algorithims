package CycleSortAmazonGoogleMicrosoftInterviewQstns;

public class FirstMissingPositive {
    public static void main(String[] args) {
//        int[] arr = {3, 4, -1, 1};
//        int[] arr = {7, 8, 10, 11, 12};
        int[] arr = {1,2, 0};
        System.out.println(missingPositive(arr));

    }
    static int missingPositive(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] -1;
            if (arr[i] > 0 && arr[i] <=arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            }else {
                i++;
            }
        }
        // CASE1: search for first missing element
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1){
                return  index + 1;
            }
        }

        return arr.length + 1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
