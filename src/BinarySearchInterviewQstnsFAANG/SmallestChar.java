package BinarySearchInterviewQstnsFAANG;

public class SmallestChar {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'f';
        char ans = nextGreatestLetter(letters, target);
        System.out.println(ans);
    }
    //Smalle >= target;

    static char nextGreatestLetter(char[] letter, char target){
        // what is the trget is grreater than the greatest number;

        int start = 0;
        int end = letter.length - 1;

        while (start <= end) {
            //find the middle element
            //  int mind = (start + end) / 2; // might be possible the (start + end) is out of integer bound
            int mid = start + (end - start) / 2;

            if (target < letter[mid]){
                end = mid - 1;
            } else  {
                start = mid + 1;
            }
        }
        return letter[start % letter.length] ;
    }
}
