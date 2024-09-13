package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class Problems {
    public static void main(String[] args) {
        int nums1[] = {7,2,2,4,7,0,3,4,5};
        int nums2[] = {3,9,8,6,1,9};
        intersect(nums1, nums2);


    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> intr = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                intr.add(nums1[i]);
                i++;
                j++;
            }
            if(i<nums1.length && j<nums2.length) {
                if (nums1[i] < nums2[j]) {
                    i++;
                }
            }
            if(i<nums1.length && j<nums2.length) {
                if(nums2[j]<nums1[i]){
                    j++;
                }
            }

        }

        int ans[] = new int [intr.size()];

        int pos = 0;
        for(int k : intr){
            ans[pos]= k;
            pos++;
        }
        return ans;

    }
}
