package Recursion.dicePbm;

import java.util.ArrayList;

public class DIceCombination {
    public static void main(String[] args) {
        dice("", 4);
        System.out.println(diceList("", 4));
        System.out.println(diceFace("", 6, 3));
        System.out.println(diceFace("", 6, 6));
    }

    public static void dice(String P, int target){
        if(target == 0){
            System.out.println(P);
            return;
        }
        for(int i = 1; i<=6 && i<= target; i++){
            dice(P+i, target-i);
        }
    }

    public static ArrayList<String> diceList(String P, int target){
        if(target == 0){

            ArrayList<String> list = new ArrayList<>();
            list.add(P);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        for(int i = 1; i<=6 && i<= target; i++){
            list.addAll(diceList(P+i, target-i));
        }
        return list;
    }

    // Dice with N no of faces

    public static ArrayList<String> diceFace(String P, int target, int face){
        if(target == 0){

            ArrayList<String> list = new ArrayList<>();
            list.add(P);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        for(int i = 1; i<=face && i<= target; i++){
            list.addAll(diceFace(P+i, target-i, face));
        }
        return list;
    }


}
