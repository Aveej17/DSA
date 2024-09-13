package Recursion;

public class BinarySearchusingRecursion {

    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        int target = 1;
        System.out.println(search(array, target, 0, array.length-1));
    }


    public static int  search(int array[], int target, int start, int end){
        if(start>end){
//            System.out.println("no value is there");
            return -1;

        }
        int mid = start + (end-start)/2;
//        System.out.println(mid+"  midpos ");
//        if(start>end){
//            System.out.println("no value is there");
//            return -1;
//        }
        if(array[mid] == target){
//            System.out.println("value found");
            return mid;
        }
        if(array[mid]>target){
//            System.out.println("checking in fist half");
            return search(array, target, start, mid-1);
        }
        else{
//            System.out.println("checking in second half");
            return search(array, target, mid+1, end);
        }
    }
}
