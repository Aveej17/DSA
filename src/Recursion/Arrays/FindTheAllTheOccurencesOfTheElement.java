package Recursion.Arrays;

import java.util.ArrayList;
import java.util.List;

public class FindTheAllTheOccurencesOfTheElement {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 4, 5};
//        List<Integer> L = new ArrayList<>();
//        L = findAll(arr, 4);
//        System.out.println(L.toString());
//        for (int i: L){
//            System.out.println(i);
//        }

        List<Integer> list1 = new ArrayList<>();
        list1 = findAll1(arr, 4, 0);
        System.out.println(list1);


    }


    public static ArrayList<Integer> findAll1(int[] array, int target, int index){
        ArrayList<Integer> result = new ArrayList<>();
        if(index == array.length){
            return result;
        }
        if(array[index] == target){
            result.add(index);
        }
        ArrayList<Integer> addAnsFromPreviousCalls = findAll1(array, target, index+1);

        result.addAll(addAnsFromPreviousCalls);
        return result;
    }

    public static ArrayList<Integer> findAll(int[] array, int target){
        ArrayList<Integer> result = new ArrayList<>();
        helper(0, array, result, target);
        return result;
    }

    public static ArrayList<Integer> helper(int pos,int [] array, ArrayList<Integer> list, int target){
        if(pos == array.length){
            return list;
        }
        if(array[pos] == target){
            list.add(pos);

        }
        return helper(pos+1, array, list, target);
    }

}
