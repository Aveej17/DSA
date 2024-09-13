package Sorting;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] array = {1, 1, 3, 5, 4};

        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int array[]) {
        int[] countArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            countArray[array[i]]++;
        }
        int pos = 0;
        int j = 1;
        while (j < countArray.length){
            while (countArray[j] > 0) {
                array[pos] = j;
                pos++;
                countArray[j] -= 1;
            }
            j++;
        }

    }
}
