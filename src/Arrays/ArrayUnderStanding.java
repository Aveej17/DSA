package Arrays;

class Solution {
    public static int[] numberGame(int[] nums) {

        for(int i = nums.length/2; i>0; i--){
            upheap(i, nums);
        }

        for(int i:nums){
            System.out.println(i);
        }


        int [] ans = new int[nums.length];

        int pos = nums.length-1;

        for(int i = 0; i< nums.length; i+=2){
            int alice = remove(nums, pos);
            int bob = remove(nums, pos-1);
            pos = pos-2;
            ans[i] = bob;
            ans[i+1] = alice;
        }
        for(int i: ans){
            System.out.print(i+" ");
        }
        return ans;
    }

    public static void upheap(int index, int [] nums){
        if (index == 0){
            return;
        }

        int parent = parent(index);

        if(nums[index]<nums[parent]){
            swap(index, parent, nums);
            upheap(parent, nums);
        }
    }

    public static int remove(int [] nums, int lastpos){
        int temp = nums[0];
        nums[0] = nums[lastpos];
        downheap(nums, lastpos, 0);
        return temp;
    }


    public static void downheap(int[] nums, int lastpos, int initialPos){
        if(lastpos == 0){
            return;
        }

        int min = initialPos;
        int left = left(min);
        int right = right(min);

        if(left<lastpos && nums[left] <= nums[min]){
            min = left;
        }
        if(right<lastpos && nums[right] <= nums[min]){
            min = right;
        }

        if(min != initialPos){
            swap(min, initialPos, nums);
            downheap(nums, lastpos, min);
        }
    }


    public static int parent(int index){
        return (index-1)/2;
    }

    public static int left (int index){
        return 2 * index + 1;
    }

    public static int right (int index){
        return 2 * index + 2;
    }

    public static void swap(int first, int second, int[] nums){

        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2,7,9,6,4,6};
        numberGame(arr);
    }
}