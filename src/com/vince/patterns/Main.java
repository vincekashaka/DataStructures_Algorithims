package com.vince.patterns;

public class Main {
    public static void main(String[] args) {
        pattern17(5);
    }

    static void pattern17(int n) {
        for (int row = 1; row <=n ; row++) {

            for (int space = 0; space < n -row; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    static void pattern30(int n) {
        for (int row = 1; row <=n ; row++) {
            for (int space = 0; space < n -row; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void patternSix(int n) {
        for (int row = 0; row < 2*n; row++) {
            // for every row, run the col
            int totalColsInRow = row > n ? 2*n - row  : row;

            int noOfSpaces = n -totalColsInRow;
            for (int s = 0; s <noOfSpaces ; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print( "* ");
            }
            // when 1 row is printed we need to add a new line
            System.out.println();
        }
    }

    static void patternFive(int n) {
        for (int row = 1; row < 2*n; row++) {
            // for every row, run the col
            int totalColsInRow = row > n ? 2*n - row  : row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print( "* ");
            }
            // when 1 row is printed we need to add a new line
            System.out.println();
        }
    }
    static void patternFour(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            // when 1 row is printed we need to add a new line
            System.out.println();
        }
    }

    static void patternThree(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= n -row + 1; col++) {
                System.out.print("* ");
            }
            // when 1 row is printed we need to add a new line
            System.out.println();
        }
    }

    static void patternOne(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            // when 1 row is printed we need to add a new line
            System.out.println();
        }
    }
    // pattern number 1
    static void patternTwo(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // when 1 row is printed we need to add a new line
            System.out.println();
        }
    }
}
