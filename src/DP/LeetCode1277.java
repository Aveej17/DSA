package DP;

public class LeetCode1277 {
    public static void main(String[] args) {
        int [] [] mat = {
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {0, 1, 1, 1}
        };

//            1277. Count Square Sub matrices with All Ones

        int ans = CountSubMatrices(mat);
        System.out.println(ans);
        int result = spaceOptimizedCountSubMatrices(mat);
        System.out.println(result);
    }

    private static int spaceOptimizedCountSubMatrices(int[][] mat) {
        int [] dp = new int[mat[0].length];
        int topLeft=0;
        int result=0;
        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat[0].length; j++){
                if(mat[i][j] == 1){
                    int top = (i==0)?0:dp[j];
                    int left = (j==0)?0:dp[j-1];
                    dp[j] = 1+ (Math.min(topLeft, Math.min( top, left)));
                    result+=dp[j];
                    topLeft = (j==dp.length-1)?0:top;
                }
                else{
                    // as left is going to be zero for next value no  need to modify the topLeft because we
                    // care about minimum

                    dp[j] = 0;
                    // no need add 0 to the result as well
                }

            }
        }
        return result;

    }

    private static int CountSubMatrices(int[][] mat) {

        int [][] dp = new int[mat.length][mat[0].length];
        int ans = 0;
        for (int i =0; i< mat.length; i++){
            for (int j = 0; j<mat[0].length; j++){
                if(i==0 || j== 0){
                    dp[i][j]= mat[i][j];
                    ans+=dp[i][j];
//                    System.out.println("Ans "+ ans);
                }
                else if (mat[i][j] == 1){
                    dp[i][j] =1+(Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1])));
                    ans+=dp[i][j];
//                    System.out.println("Ans "+ ans);
                }
                else{
                    dp[i][j] = 0;
                }
            }
        }

        return ans;
    }
}
