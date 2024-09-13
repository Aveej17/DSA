package Recursion.sort;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int [] arr= {5, 4, 3, 19, 24, 78 };
        sort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int [] array, int start, int end){
        if(end-start == 1){
            return;
        }
        int mid = start+(end-start)/2;
        sort(array, start, mid);
        sort(array, mid, end);
        merge(array, start, mid, end);

    }
    static void merge (int [] array, int start, int mid, int end){
        int [] mix = new int [end-start];

        int i = start;
        int j = mid;
        int k = 0;
        while(i<mid && j < end){
            if(array[i]<array[j]){
                mix[k] = array[i];
                i++;
            }
            else{
                mix[k] = array[j];
                j++;
            }
            k++;
        }
        while(i<mid){
            mix[k] = array[i];
            i++;
            k++;
        }
        while(j<end){
            mix[k] = array[j];
            j++;
            k++;
        }

        for (int l= 0; l<mix.length; l++){
            array[start+l] = mix[l];
        }

    }

}
