package com.vince.Recursion.mazeProblem;

public class AllPaths {

    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        allPath("",board, 0, 0);

    }


    static void allPath(String p, boolean[][] maze, int row, int column) {
        if (row == maze.length - 1 && column == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[row][column]) {
            return;
        }

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






    }
}
