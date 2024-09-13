package BiginnersDSASheet;
import java.util.Arrays;

public class CoinChange {

    public static void main(String[] args) {
        int [] coins = {1, 2};
        int pos = coins.length;
        int target = 4;
        System.out.println(countPossibleWays(coins, pos, target));

        int [][] dp = new int[pos+1][target+1];

        for (int[] row : dp)
            Arrays.fill(row, -1);
        System.out.println(countPossibleWaysMemo(coins, pos, target, dp));

    }


    // Recursion
    public static int countPossibleWays(int [] coins, int pos, int target){
        if(target == 0){
            return 1;
        }
        if(target<0){
            return 0;
        }
        if(pos<=0){
            return 0;
        }
        return countPossibleWays(coins, pos-1, target)+countPossibleWays(coins, pos, target-coins[pos-1]);
    }

    public static int countPossibleWaysMemo(int [] coins, int pos, int target, int[][] dp){
        if(target == 0){
            return 1;
        }
        if(target<0){
            return 0;
        }
        if(pos<=0){
            return 0;
        }
        if(dp[pos][target] != -1){
            return dp[pos][target];
        }
        return dp[pos][target]=countPossibleWaysMemo(coins, pos-1, target, dp)+countPossibleWaysMemo(coins, pos, target-coins[pos-1], dp);
    }


}
