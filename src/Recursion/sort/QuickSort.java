package Recursion.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int [] array = {10,11,12,13,19,17,18,12};
        sort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));



    }
    static void sort(int [] array, int low, int high){
        if(low>high){
            return;
        }
        int s = low;
        int e = high;

        int mid = s+(e-s)/2;
        int pivot = array[mid];

        while(s<=e){
            // also a reason why if it's already sorted it won't swap
            while (array[s]<pivot){
                s++;
            }
            while(array[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp = array[s];
                array[s]= array[e];
                array[e] = temp;
                s++;
                e--;
            }

            // now my pivot is at correct index and now please sort the two halves
            sort(array,low, e);
            sort(array,s, high);

        }
    }
}
