package Sorting;

public class InsertionSort {

    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 6, 7, 84, 3 , 23};
        sort(arr);
        for (int i: arr){
            System.out.println(i);
        }
    }

    public static void sort(int array[]){
        for(int i = 1; i< array.length-1; i++){
            int j = i-1;
            int key = array[i];
            while(j>=0 && key<array[j]){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;


        }
    }

}
