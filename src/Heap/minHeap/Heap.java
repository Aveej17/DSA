package Heap.minHeap;

import java.util.ArrayList;

public class Heap <T extends Comparable<T>>{

    private final ArrayList<T> list;

    public Heap(){
        list = new ArrayList<>();
    }

    private int parent(int i){
        return (i-1)/2;
    }

    private int left(int i){
        return i * 2 + 1;
    }

    private int right(int i){
        return i * 2 + 2;
    }

    private void swap(int first, int second){
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    public void add(T value){
        list.add(value);

        upHeap(list.size()-1);
    }

    private void upHeap(int index){
        int parent = parent(index);
        if(list.get(parent).compareTo(list.get(index))>0){
            swap(parent, index);
            upHeap(parent);
        }
    }

    public T remove() throws Exception {
        if(list.isEmpty()){
            throw new Exception("Heap is Empty!");
        }
        T temp = list.get(0);

        T last = list.remove(list.size()-1);
        if(!list.isEmpty()){
            list.set(0, last);
            downHeap(0);
        }
        return temp;
    }

    private void downHeap(int index){
        int min = index;
        int left = left(index);
        int right = right(index);

        if(left<list.size() && list.get(min).compareTo(list.get(left))>0){
            min = left;
        }
        if(right<list.size() && list.get(min).compareTo(list.get(right))>0){
            min = right;
        }

        if(min!=index){
            swap(min, index);
            downHeap(min);
        }
    }



    public void print() {
        System.out.println(list);
    }


    public ArrayList<T> sort() throws Exception {
        ArrayList<T> ans = new ArrayList<>();
        while (!list.isEmpty()){
            ans.add(this.remove());
        }
        return ans;
    }
}
