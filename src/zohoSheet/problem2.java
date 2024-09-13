package zohoSheet;

import java.util.*;


public class problem2 {

    public static void main(String[] args) {
        int [] nums = {131, 11, 48};
        int [] ans = common_digits(nums);

        System.out.println(Arrays.toString(ans));

    }


    public static int[] common_digits(int[] nums)
    {
        // code here
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            int temp = nums[i];
            while(temp>0){
                int digit = temp%10;
                if(!map.containsKey(digit)){
                    map.put(digit, 1);
                }
                temp /=10;
            }
        }

        int [] ans = new int [map.size()];
        int count = 0;
        for(int i = 0 ; i<=9; i++){
            if(map.containsKey(i)){
                ans[count] = i;
                count++;
            }

        }


        return ans;
    }
}
