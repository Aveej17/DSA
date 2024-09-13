package Arrays;

import java.util.ArrayList;

public class ArrayListExamples {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(8);
        arr.add(1,4);
        arr.set(0, 45);
        arr.remove(0);
        arr.remove(arr.get(0));
        arr.contains(7);

        ArrayList<ArrayList<Integer>> ar = new ArrayList<>();

        // Initialization

        for(int i = 0; i<3; i++){
            ar.add(new ArrayList<>());
        }

        ar.get(0).add(3);

        System.out.println(ar);
    }
}
