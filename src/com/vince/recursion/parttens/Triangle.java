package com.vince.recursion.parttens;

public class Triangle {

    public static void main(String[] args) {

        triangle(4, 0);
    }

    static void triangle(int row, int column){
        if (row == 0){
            return;
        }
        if (column < row){
            System.out.print("*");
        triangle(row, column+1);
    } else {
        System.out.println();
        triangle(row-1, 0);
    }
    }
}
