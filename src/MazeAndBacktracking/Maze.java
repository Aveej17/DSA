package MazeAndBacktracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(pathCount(3,3));
//        pathPrint("", 3, 3);
//        System.out.println(pathArray("",3, 3));

        int array[][] = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1},
        };
        System.out.println(pathWithObstacle("", 0,  0, array));
    }

    public static int pathCount(int row, int col){
        if(row==1 || col == 1){
            return 1;
        }
        int left  = pathCount(row-1, col);
        int down = pathCount(row, col-1);
        return left+down;
    }

    public static void pathPrint(String p, int row, int col){
        if(row==1 && col == 1){
            System.out.println(p);
            return ;
        }
        if(row>1) {
            pathPrint(p + "D", row - 1, col);
        }
        if(col>1) {
            pathPrint(p + "R", row, col - 1);
        }
    }

    public static ArrayList<String> pathArray(String p, int row, int col){
        if(row==1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        ArrayList<String> list = new ArrayList<>();
        if(row>1) {
            list.addAll(pathArray(p + "D", row - 1, col));
        }
        if(col>1) {
            list.addAll(pathArray(p + "R", row, col - 1));
        }
        return list;
    }


    public static ArrayList<String> pathWithObstacle(String p, int row, int col, int[][] maze){
        if(row== maze.length-1 && col == maze[0].length-1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        if(maze[row][col]==0){
            return new ArrayList<>();
        }
        ArrayList<String> list = new ArrayList<>();
        if(row< maze.length-1) {
            list.addAll(pathWithObstacle(p + "D", row + 1, col, maze));
        }
        if(col< maze[0].length-1) {
            list.addAll(pathWithObstacle(p + "R", row, col + 1, maze));
        }
        return list;
    }
}
