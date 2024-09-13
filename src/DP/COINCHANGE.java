package DP;

public class COINCHANGE {

    static int [][] dp;

    static int count = 0;
    public static void main(String[] args) {

        int [] coins = {2, 3, 5, 6};
        int total = 10;
        System.out.println(recursion(coins, 0, total,  0));

        dp = new int [coins.length+1][total+1];
        for(int i = 0; i<coins.length+1; i++){
            for(int j = 0; j<total+1; j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(tabulation(coins, total));


    }

    private static int tabulation(int[] coins, int total) {
        return 1;
    }


    private static int recursion(int [] arr, int sum, int total, int sIndex){
        if(sIndex==arr.length){
            return 0;
        }
        if(sum==total){
            return 1;
        }
        if(sum>total){
            return 0;
        }
        count = recursion(arr, sum+arr[sIndex], total,  sIndex)+ recursion(arr, sum, total,  sIndex+1);

        return count;

    }
}
