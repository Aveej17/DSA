package DP;

public class LEETCODE1575 {

    public static void main(String[] args) {
        LEETCODE1575 pbm = new LEETCODE1575();
        System.out.println(pbm.countRoutes(new int[]{1,2,3},0,2, 40 ));
    }
    public int countRoutes(int[] locations, int start, int finish, int fuel) {

        // recursion way takes a lot of time
        int ways = helper(locations, start, finish, fuel);
        if(start ==finish ){
            ways+=1;
        }
        return ways;

    }

    public int helper(int[] locations, int start, int finish, int fuel){
        int mod = 1000000007;
        int ways=0;
        for(int i = 0; i<locations.length; i++){
            if(i!=start){
                int costFuel = Math.abs(locations[i] - locations[start]);
                if(fuel>=costFuel){
                    if(i == finish){
                        ways += 1 + helper(locations, i, finish, fuel-costFuel)%mod;
                    }
                    else{
                        ways += helper(locations, i, finish, fuel-costFuel)%mod;
                    }
                }
            }
        }
        return ways;
    }
}
