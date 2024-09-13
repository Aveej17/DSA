package DP;

import java.util.ArrayList;

public class LIS {
    public static void main(String[] args) {
//        int [] array = {3, 4, 2, 8, 10, 5, 1};
//        int [] array = {1, 2, 3, 4,5 , 6, 7, 67};

//        int [] array = {100, 90, 80, 70, 60, 50};
        int [] array = {10, 5, 18, 7, 2, 9};
        System.out.println(lisEfficient(array));
        System.out.println(lis(array));
    }


    public static int lisEfficient(int [] array) {
        ArrayList<Integer> lis = new ArrayList<>();
        lis.add(array[0]);
        for (int i = 1; i < array.length; i++) {
            if (array[i] > lis.getLast()) {
                lis.add(array[i]);
            } else {

                // finding the ceil of a number and updating its value with array[i]

                int start = 0;
                int end = lis.size()-1;
                while (start < end) {
                    int mid = start + (end - start) / 2;
                    if (lis.get(mid) < array[i]) {
                        start = mid + 1;
                    } else {
                        end = mid;
                    }
                }
                lis.set(end, array[i]);
            }
        }
        return lis.size();
    }

    public static int lis(int [] array){
        int [] lis = new int[array.length];
        lis[0] = 1;

        for(int i = 1; i<array.length; i++){
            int lisVal = 0;
            for(int j = 0; j<i; j++){
                if(array[j] < array[i] && lis[j] > lisVal){
                    lisVal = lis[j];
                }
            }
            lis[i] = 1+ lisVal;
        }
        int max = 1;
        for(int i = 0; i<lis.length; i++){
            if(lis[i]>max){
                max = lis[i];
            }
        }
        return max;
    }
}
