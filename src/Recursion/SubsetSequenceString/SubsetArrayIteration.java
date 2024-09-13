package Recursion.SubsetSequenceString;

import java.util.ArrayList;
import java.util.Arrays;

public class SubsetArrayIteration {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        System.out.println(printAllSubset(arr));
        int darr[] = {1, 2, 1};
        System.out.println(printAllSubsetDuplicates(darr));
    }

    public static ArrayList<ArrayList<Integer>> printAllSubset(int [] arr){
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }

        }
        return outer;
    }

    public static ArrayList<ArrayList<Integer>> printAllSubsetDuplicates(int [] arr){

        Arrays.sort(arr);

        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());


        // to handle duplicates

        int start = 0;
        int end = 0;


        for(int i = 0; i<arr.length; i++){
            start = 0;
            if(i>0 && arr[i-1] == arr[i]){
                start = end+1;
            }
            end = outer.size()-1;
            int n = outer.size();
            for (int j = start; j < n; j++) {

                ArrayList<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }

        }
        return outer;
    }
}
