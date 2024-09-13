package Sorting;


public class Sort {
    public static void main(String[] args) {
        int arr[] = {8, 3, 4, 5, 6, 7};
        bubble(arr);
        for (int j : arr) {
            System.out.print(j+" ");
        }
    }

    static void bubble(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for(int j=0; j<array.length-i-1; j++){
                if(array[j]>array[j+1]){
                    swap(array, j, j+1);
                }
            }
        }
//        return array;
    }

    static void swap(int array[], int first, int second){
        int temp = array[first];
        array[first]  = array[second];
        array[second] = temp;
    }


}
