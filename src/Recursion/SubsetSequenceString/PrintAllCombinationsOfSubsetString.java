package Recursion.SubsetSequenceString;

import java.util.ArrayList;

public class PrintAllCombinationsOfSubsetString {
    public static void main(String[] args) {
        String abc = "AB";

        System.out.println(subsetsArray("", abc));
//        System.out.println(a);
    }

    public static  void subsets(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.print(processed+" ");
            return;
        }
        subsets(processed+unprocessed.charAt(0), unprocessed.substring(1));
        subsets(processed, unprocessed.substring(1));
    }

    public static ArrayList<String> subsetsArray(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
//            if(!processed.isEmpty()){
                ArrayList<String> list= new ArrayList<>();
                list.add(processed);
                return list;

//            }
        }

        ArrayList<String> left = subsetsArray(processed+unprocessed.charAt(0), unprocessed.substring(1));
        ArrayList<String> right = subsetsArray(processed, unprocessed.substring(1));
//        if(!right.isEmpty())
            left.addAll(right);
        return left;
    }
}
