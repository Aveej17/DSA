package MazeAndBacktracking;

import java.util.Arrays;

public class BackTracking {
    public static void main(String[] args) {
        int [][]maze= {
                {1, 1, 1},
                {1, 1, 1},
                {0, 1, 1}
        };
        int [][]  ans = new int[maze.length][maze[0].length];
//        allPathAllowed("", 0, 0, maze);
        allPathAllowedPrint("", 0, 0, maze, ans, 1);
    }



    public static void allPathAllowed(String p, int row, int col, int maze[][]) {
        if (row == maze.length - 1 && col == maze[0].length - 1 ) {
            System.out.println(p);
            return;
        }
        if(maze[row][col] == -1 || maze[row][col] == 0){
            return;
        }
        int temp = maze[row][col];
        maze[row][col] =-1;

        if (row < maze.length - 1) {
            allPathAllowed(p+"D", row + 1, col, maze);
        }
        if (col < maze.length - 1) {
            allPathAllowed(p+"R", row, col + 1, maze);
        }
        if (row > 0) {
            allPathAllowed(p+"U", row - 1, col, maze);
        }
        if (col > 0) {
            allPathAllowed(p+"L", row, col - 1, maze);
        }
        maze[row][col] = temp;
    }


    public static void allPathAllowedPrint(String p, int row, int col, int maze[][], int ans[][], int step) {
        if (row == maze.length - 1 && col == maze[0].length - 1 ) {
            ans[row][col] =step;
            for(int []arr: ans){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(maze[row][col] == -1 || maze[row][col] == 0){
            return;
        }
        int temp = maze[row][col];
        maze[row][col] =-1;
        ans[row][col] = step;

        if (row < maze.length - 1) {
            allPathAllowedPrint(p+"D", row + 1, col, maze, ans, step+1);
        }
        if (col < maze.length - 1) {
            allPathAllowedPrint(p+"R", row, col + 1, maze, ans, step+1);
        }
        if (row > 0) {
            allPathAllowedPrint(p+"U", row - 1, col, maze, ans, step+1);
        }
        if (col > 0) {
            allPathAllowedPrint(p+"L", row, col - 1, maze, ans, step+1);
        }
        maze[row][col] = temp;
        ans[row][col] = 0;
    }
}
