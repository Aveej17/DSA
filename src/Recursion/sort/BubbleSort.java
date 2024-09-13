package Recursion.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int array[] = {2, 3, 59, 90, 19, 10};
//        int array[] = {4, 3, 2};
        sort(array, array.length-1, 0);
        System.out.println(Arrays.toString(array));
//        for(int i : array){
//            System.out.print(i+" ");
//        }

    }

    public static void sort(int [] array, int length, int pos) {
        if(length == 0){

            return;
        }      if(pos < length){
            if(array[pos]>array[pos+1]){
                int temp = array[pos+1];
                array[pos+1] = array[pos];
                array[pos] = temp;
            }
            sort(array, length, pos+1);
        }
        else{
            sort(array, length-1, 0);
        }

    }
}
