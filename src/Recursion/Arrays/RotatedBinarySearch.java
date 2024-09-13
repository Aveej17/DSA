package Recursion.Arrays;

import java.util.ArrayList;
import java.util.List;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int [] arr = {5, 6, 7, 9, 10, 0, 1, 2, 3, 4};
        // find 2 if it's there
        int ans;
        ans = findOccurrencesOfTarget(arr, 2);
        System.out.println(ans);
    }
    public static int findOccurrencesOfTarget(int [] array, int target){
        int s = 0;
        int e = array.length-1;

        return helper(array, target,s, e);
    }

    public static int helper(int [] array, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int mid = s+(e-s)/2;
        if(array[mid] == target){
            return mid;
        }
        if(array[s]<array[mid]) {
            if (array[s] <target && target < array[mid]) {
                e = mid - 1;
                return helper(array, target, s, e);
            }
            else{
                s=mid+1;
                return helper(array, target, s, e);
            }
        }
        else {
            if (array[mid] < target && target < array[e]) {
                s = mid + 1;
                return helper(array, target, s, e);
            }
            else {
                e = mid - 1;
                return helper(array, target, s, e);
            }
        }
    }


}
