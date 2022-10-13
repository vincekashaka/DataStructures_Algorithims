package com.vince.cycleSortAmazonGoogleMicrosoftInterviewQstns;

public class FindIndices {
    public static void main(String[] args) {
        int arr [] = {5, 6, 9};
        int target = 11;
        System.out.println(findIndices(arr, target, 0));

    }

    static int findIndices(int arr[], int target, int index){


        if (arr == null) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (arr[i] + arr[j] == target && i != j){
                    return index;
                }
            }
        }
        return index;
    }

}
