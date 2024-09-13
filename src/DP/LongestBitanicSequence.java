package DP;

import java.util.ArrayList;


public class LongestBitanicSequence {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 6, 32, 21, 4, 5, 52};
        System.out.println(bitanicSequence(array));
    }

    private static int[] lis(int [] array) {
        int[] lis = new int[array.length];
        lis[0] = 1;

        for (int i = 1; i < array.length; i++) {
            int lisVal = 0;
            for (int j = 0; j < i; j++) {
                if (array[j] < array[i] && lis[j] > lisVal) {
                    lisVal = lis[j];
                }
            }
            lis[i] = 1 + lisVal;
        }
        return lis;
    }
    private static ArrayList<Integer> lis1(int [] array){
        ArrayList<Integer> lis = new ArrayList<>();
        lis.add(array[0]);

        for(int i = 1; i<array.length; i++){
            if(array[i]>lis.getLast()){
                lis.add(array[i]);
            }
            else{
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
        return lis;
    }

    private static void reverse(int [] array){
        int start = 0;
        int end = array.length-1;
        while(start<=end){
            int temp = array[start];
            array[start]= array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    private static int bitanicSequence(int [] array){


        for(int i:array){
            System.out.print(i+" ");
        }
        System.out.println();
        int [] a = lis(array);
        reverse(array);
        for(int i:array){
            System.out.print(i+" ");
        }
        System.out.println();
        int [] b = lis(array);

        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i:b){
            System.out.print(i+" ");
        }
        System.out.println();
//
        int res = 0;
        for(int i = 0; i<a.length; i++){

                res = Math.max(a[i]+ b[i] - 1, res);
            }
        return res;
    }
}
