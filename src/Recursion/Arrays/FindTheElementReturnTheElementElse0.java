package Recursion.Arrays;

public class FindTheElementReturnTheElementElse0 {

    public static void main(String[] args) {
        int [] array = { 10, 30, 48, 90, 123, 9};
        System.out.println(linearSearch(array, 10));
    }

    public static int linearSearch(int [] array, int target){
        return helper(array, target, 0);
    }

    public static int helper(int [] array, int target, int index){
        if (index == array.length){
            return 0;
        }
        if(array[index] == target){
            return target;
        }
        return helper(array, target, (index+1));
    }
}
