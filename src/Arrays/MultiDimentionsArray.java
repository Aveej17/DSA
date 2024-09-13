package Arrays;

public class MultiDimentionsArray {
    public static void main(String[] args) {
        /*
            1 2 3
            4 5 6
            7 8 9
         */

//        int [][] ar = {{1, 2, 3},
//                        {4, 5, 6},
//                        {7, 7, 8}};
//
//        System.out.println(Arrays.toString(ar[1]));

//        int [][] arr = new int [3][5];  // column is optional but row is mandate

//        Scanner in = new Scanner(System.in);

//        for(int row = 0; row<arr.length; row++){
//            for(int col = 0; col<arr[row].length; col++){
////                System.out.println("Enter the value to add "+row+" col "+col);
////                arr[row][col] = in.nextInt();
//            }
//
//        }

//        for(int row = 0; row<arr.length; row++){
//            for(int col = 0; col<arr[row].length; col++){
////                System.out.println("Enter the value to add "+row+" col "+col)
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }

//        for(int row = 0; row<arr.length; row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }

//        for(int [] array: arr){
//            System.out.println(Arrays.toString(array));
//        }

        int [][] ar1 = new int [7][];

        for(int i = 0; i<7; i++){
            ar1[i] = new int[i+1];
            for(int j =0; j<=i; j++){
                ar1[i][j] = j;
            }
        }
//        for(int [] array: ar1){
//            System.out.println(Arrays.toString(array));
//        }


    }
}
