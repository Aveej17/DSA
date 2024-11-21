package Sorting;

import java.util.ArrayList;
import java.util.List;

public class QuickSortPair {

    public static void main(String[] args) {
        List<Pair> list = new ArrayList<>();
        list.add(new Pair(1, 2));
        list.add(new Pair(10, 1));

        int pos = 1;
        quickSort(list, pos, 0, list.size()-1, false);

        System.out.println(list.toString());
    }

    public static void quickSort(List<Pair>list, int pos, int start, int end, boolean isAscending){
        if(start<end){
            int pivot = partition(list, pos, start, end, isAscending);

            quickSort(list, pos,start, pivot-1, isAscending);
            quickSort(list, pos, pivot+1, end, isAscending);
        }
    }

    public static int partition(List<Pair> list, int pos, int start, int end, boolean isAscending){
        int l=start+1;
        int r = end;
        while(l<=r){
            while(l<=end && compare(list.get(start), list.get(l), pos, isAscending)){
                l++;
            }
            while (r > start && !compare(list.get(start), list.get(r), pos, isAscending)){
                r--;
            }
            if(l<=r){
                swap(l, r, list);
                l++;
                r--;
            }
        }
        swap(start, r, list);
        return r;

    }

    public static void swap(int first, int second, List<Pair> list){
        Pair temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);

    }
    public static boolean compare(Pair a, Pair b, int pos, boolean isAscending){
        if(pos == 0){
            if(isAscending){
                return a.first >= b.first;
            }
            else {
                return a.first <= b.first;
            }
        }
        else{
            if(isAscending){
                return a.second >= b.second;
            }
            else{
                return a.second <= b.second;
            }
        }
    }

}
