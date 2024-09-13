package Recursion.sort;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int array[] = {8,5, 4, 6};
        System.out.println(Arrays.toString(array));
        int [] a = sort(array);
        System.out.println(Arrays.toString(a));
    }

    public static int[] sort(int [] array){


        if (array.length == 1){
            return array;
        }
        int mid=array.length/2;

        int[] left=sort(Arrays.copyOfRange(array, 0, mid));
        int[] right = sort(Arrays.copyOfRange(array, mid, array.length));

        return merge(left, right);
    }
    public static int[] merge(int [] first, int[]second){
        int [] mix = new int [first.length+second.length];

        int f = 0;
        int s = 0;
        int m = 0;

        while(s< second.length &&  f<first.length){
            if(first[f]<second[s]){
                mix[m] = first[f];
                f++;
            }
            else {
                mix[m] = second[s];
                s++;

            }
            m++;
        }
        while(f<first.length){
            mix[m] = first[f];
            f++;
            m++;

        }
        while(s<second.length){
            mix[m] = second[s];
            s++;
            m++;

        }
        return mix;
    }
}
