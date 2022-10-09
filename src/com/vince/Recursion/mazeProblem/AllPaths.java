package com.vince.Recursion.mazeProblem;

import java.util.Arrays;
import java.util.PropertyResourceBundle;

public class AllPaths {

    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
//        allPath("",board, 0, 0);
        int[][] path = new int[board.length][board[0].length];
        allPathPrintBacktracking("", board, 0, 0, path,1 );

    }


    static void allPath(String p, boolean[][] maze, int row, int column) {
        if (row == maze.length - 1 && column == maze[0].length - 1) {
            return;
        }
        System.out.println(p);
        System.out.println();

        if (!maze[row][column]) {
            return;
        }

        // not false
        maze[row][column] = false;

        if (row < maze.length - 1) {
            allPath(p + 'D', maze, row + 1, column);
        }

        if (column < maze[0].length - 1) {
            allPath(p + 'R', maze, row, column + 1 );
        }

        if (row > 0) {
            allPath(p + 'U', maze, row -1, column );
        }

        if (column > 0) {
            allPath(p + 'U', maze, row, column - 1);
        }

        // this line is where the func will be over
        // before the func is removed also remove changes that were made by that func
        maze[row][column] = true;

    }


    static void allPathPrintBacktracking(String p, boolean[][] maze, int row, int column, int[][] path, int step ) {
        if (row == maze.length - 1 && column == maze[0].length - 1) {
            path[row][column] = step;
            for (int [] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (!maze[row][column]) {
            return;
        }

        // not false
        maze[row][column] = false;
        path[row][column] = step;

        if (row < maze.length - 1) {
            allPathPrintBacktracking(p + 'D', maze, row + 1, column, path, step + 1);
        }

        if (column < maze[0].length - 1) {
            allPathPrintBacktracking(p + 'R', maze, row, column + 1, path, step + 1);
        }

        if (row > 0) {
            allPathPrintBacktracking(p + 'U', maze, row - 1, column, path, step + 1);
        }

        if (column > 0) {
            allPathPrintBacktracking(p + 'U', maze, row, column - 1, path, step + 1);
        }

        // this line is where the func will be over
        // before the func is removed also remove changes that were made by that func
        maze[row][column] = true;

        path[row][column] = 0;
    }
}
