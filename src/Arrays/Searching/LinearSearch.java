package Arrays.Searching;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i< 10; i++){
            list.add((int)(Math.random()*i*10));
        }

        System.out.println(list);

        for(int num : list){
            if(num == 23) {
                System.out.println(true);
            }
        }
    }
}
