package MazeAndBacktracking;



public class NKnights {

    public static void main(String[] args) {
        int n = 8;
        boolean [][] board = new boolean[n][n];
        System.out.println(knights(board, 0, 0, n));

    }


    static int knights(boolean [][] board, int row, int col, int knights){
        if(knights == 0){
            display(board);
            System.out.println();

            return 1;
        }
        int count = 0;
        // checking for Boundary
        if(row == board.length-1 && col==board.length){
            return 0;
        }

        if(col == board.length){
            count += knights(board, row+1, 0, knights);
            return 0;
        }
        if(isSafe(board, row, col)){
            board[row][col] = true;
            count += knights(board, row, col+1, knights-1);
            board[row][col] = false;
        }
        count += knights(board, row, col + 1, knights);
        return count;

    }

    static boolean isSafe(boolean [][] board, int row, int col){
        if(isValid(board, row-2, col-1)){
            if(board[row-2][col-1]){
                return false;
            }
        }
        if(isValid(board, row-2, col+1)){
            if(board[row-2][col+1]){
                return false;
            }
        }
        if(isValid(board, row-1, col-2)){
            if(board[row-1][col-2]){
                return false;
            }
        }
        if(isValid(board, row-1, col+2)){
            if(board[row-1][col+2]){
                return false;
            }
        }
        return true;
    }

    static boolean isValid(boolean [][] board, int row, int col){
        if(row>=0 && row<board.length && col >= 0 && col<board.length){
            return true;
        }
        return false;
    }

    static void display(boolean[][] board){
        for(boolean[] row : board){
            for(boolean knight : row){
                if(knight){
                    System.out.print("K ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

}
