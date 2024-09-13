package Recursion.pattern;


// * * * *
// * * *
// * *
// *
public class Stars {
    public static void main(String[] args) {
        printPattern(10, 0);


        printPattern1(10, 0);
    }
    public static void printPattern(int row, int col){
        if(row==0){
            return;
        }
        if(col<row){
            System.out.print("* ");
            printPattern(row, col+1);
        }
        if(row == col){
            System.out.println();
            printPattern(row-1, 0);
        }


    }
    public static void printPattern1(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            printPattern1(row, col + 1);
            System.out.print("* ");
        }
        if (row == col) {
            printPattern1(row - 1, 0);
            System.out.println();
        }
    }
}
