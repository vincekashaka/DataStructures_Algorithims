package com.vince.Recursion.mazeProblem;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(count(3, 3));
//        path("", 3, 3);
//        System.out.println(pathRet("", 3, 3));
//        System.out.println(pathDiagonal("", 3, 3));

        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };

        pathWithRestrictions("", board, 0, 0 );
    }

    static int count(int row, int column) {
        if (row == 1 || column == 1) {
            return 1;
        }

        int left = count(row - 1, column);
        int right = count(row, column - 1);

        return left + right;
    }


    static void path(String p, int row, int column) {
        if (row == 1 && column == 1) {
            System.out.println(p);
            return;
        }

        if (row > 1) {
            path(p + 'D', row - 1, column);
        }

        if (column > 1) {
            path(p + 'R', row, column - 1);
        }
    }

    static ArrayList<String> pathRet(String p, int row, int column) {
        if (row == 1 && column == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }

        ArrayList<String> list = new ArrayList<>();

        if (row > 1) {
            list.addAll(pathRet(p + 'D', row - 1, column));
        }

        if (column > 1) {
            list.addAll(pathRet(p + 'R', row, column - 1));
        }
        return list;
    }

    static ArrayList<String> pathDiagonal(String p, int row, int column) {
        if (row == 1 && column == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }

        ArrayList<String> list = new ArrayList<>();


        if (row > 1 && column > 1) {
            list.addAll(pathDiagonal(p + 'D', row - 1, column - 1));
        }

        if (row > 1) {
            list.addAll(pathDiagonal(p + 'V', row - 1, column));
        }

        if (column > 1) {
            list.addAll(pathDiagonal(p + 'H', row, column - 1));
        }
        return list;
    }

    //Path with restrictions
    static void pathWithRestrictions(String p, boolean[][] maze, int row, int column) {
        if (row == maze.length - 1 && column == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[row][column]){
            return;
        }

        if (row < maze.length - 1) {
            pathWithRestrictions(p + 'D', maze, row + 1, column);
        }

        if (column < maze[0].length - 1) {
            pathWithRestrictions(p + 'R', maze,  row, column + 1);
        }
    }


}
