package Recursion.SubsetSequenceString;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {

//        permutations("", "abc");
//        List<String> ans = permutationsList("", "opl");
//        System.out.println(ans);
//        System.out.println(permutationsList("", "abcd"));

        System.out.println(permutationsCount("", "Jeeva"));

    }

    static void permutations(String P, String UP){
        if(UP.isEmpty()){
            System.out.println(P);
            return;
        }

        for(int i = 0; i<=P.length(); i++){
            permutations(P.substring(0, i)+UP.charAt(0)+P.substring(i), UP.substring(1));
        }

    }

    static List<String> permutationsList(String P, String UP){
        if(UP.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(P);
//            System.out.println(P);  // P -> processed String
            return list;
        }

        List<String> result = new ArrayList<>();
        for(int i = 0; i<=P.length(); i++){
             result.addAll(permutationsList(P.substring(0, i)+UP.charAt(0)+P.substring(i), UP.substring(1)));
        }
       return result;
    }


    static int permutationsCount(String P, String UP){
        if(UP.isEmpty()){
            return 1;
        }

        int count = 0;

        for(int i = 0; i<=P.length(); i++){
            count+=permutationsCount(P.substring(0, i)+UP.charAt(0)+P.substring(i), UP.substring(1));
        }
        return count;
    }
}
