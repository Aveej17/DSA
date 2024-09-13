package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int array[] = {10, 30, 40, 50, 79, 98, 1};
        sort(array);
        for(int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void sort(int array[]){
        for(int i = 0; i<array.length; i++){
            int minIndex = i;
            for(int j = i+1; j<array.length; j++){

                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            swap(i, minIndex, array);
        }
    }

    public static void swap(int first, int second, int [] array){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
