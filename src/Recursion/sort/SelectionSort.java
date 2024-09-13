package Recursion.sort;

import Sorting.Sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 0, -1, 8, 7};
        sort(array, 0, array.length-1, 0);
        System.out.println(Arrays.toString(array));

    }

    public static void sort(int []array, int pos, int length, int maxIndex) {

        if (length == 0) {
            return;
        }
        if (pos <= length) {
            if(array[pos]>array[maxIndex]){
//                maxIndex = pos;
                sort(array, pos+1, length, pos);
            }
            else {
                sort(array, pos + 1, length, maxIndex);
            }
        }
        else {
//        if(pos == length){
//            if(array[maxIndex]>array[length]) {
            int temp = array[length];
            array[length] = array[maxIndex];
            array[maxIndex] = temp;
//            }
//        }
            sort(array, 0, length-1, 0);
        }



    }
}
