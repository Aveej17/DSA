package TimeAndSpaceComplexity;


// it is a function that tells us how the time is going to grow as the size grows
//
// why do we care time complexity -> to attain a result in a minimum no of time for a larger input
//
// Procedure for Analyzing time complexity
//     1. Always look for worst time complexity
//     2. Allways look for Larger amount of Data
//
// y = x
// y = 2x
// y = 4x            all y are linearly growing
//
//
// O(1) < O(log(n))<O(nlog(n)<O(n)<O(2^n)
//
// Big oh Notation -> this is the upper bound
//
//
//   time complexity f(n) = 6N^3+7N^2+N
//
// upperBound time Complexity = O(N^3)
//
// proof ==> lim                   f(n)/O(n)         < infinity
//                x-> infinity
//
//
//
//                        6N^3+7N^2+N                       6N^3   +7N^2   +  N              6    +7   +     1
//                        _____________   =>                  ____   ____     ____    =>           ____    ____
//                            N^3                               N^3      N^3     N^3                N      N^2
//
//
//
//       6+ 7/(infinity)^2 + 1/infinity ===> 6+0+0 ===> 6 it is less than infinity




public class Basics {
    public static void main(String[] args) {

//        int [] test = {9, 9, 9, 9, 9, 9, 9, 9};
//        System.out.println(plusOne(test));

        int nums[] = {0,2,1,5,3,4};
        buildArray(nums);

    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static int[] nums1(int[] nums,int a){
        if(a<nums.length){
            int r = nums[nums[a]];
            nums1(nums,a+1);
            nums[a] = r;
        }
        return nums;
    }
    public static int[] buildArray(int[] nums) {
        return nums1(nums,0);
    }
}
