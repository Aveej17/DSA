package Recursion.Arrays;

public class FindTheArraySortedReturnBoolean {
    public static void main(String[] args) {
        int [] array = {10, 100, 200, 39};
        System.out.println(checkSorted(array));
    }

    public static boolean checkSorted(int []array){
        if (array.length == 0)
            return true;
        return helper(0, array);
    }

    public static boolean helper(int index, int array[]){
        // Base Condition
        if(index == array.length-1){
            return true;
        }
        if(array[index]>array[index+1]){
            return false;
        }
        return helper(index+1, array);
    }
}
