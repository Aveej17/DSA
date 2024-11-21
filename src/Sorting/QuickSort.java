package Sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
//        int [] arr  = {2, 4, 1, 3, 5, 7, 61, 8, 100, 9};
        int [] arr = {10, 11, 12, 13, 19, 17, 18, 12};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int start, int end) {
        if(start<end) {
            System.out.println(Arrays.toString(arr));
            int pivot = partition(arr, start, end);
            quickSort(arr, start, pivot - 1);
            quickSort(arr, pivot + 1, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot=arr[start];
        int i=start,j=end;
        while(i<j){
            while (arr[i]<=pivot && i<=end-1){
                i++;
            }
            while (arr[j]>=pivot && j>=start+1){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[start];
        arr[start] = arr[j];
        arr[j] = temp;
        return j;
    }
}
