package Heap.maxHeap;

import java.util.ArrayList;

public class Heap <T extends Comparable<T>>{

    private final ArrayList<T> list;

    public Heap() {
        list = new ArrayList<>();
    }

    private int parent(int i){
        return (i-1) / 2;
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
//        System.out.println("Adding "+value);
        list.add(value);
        upHeap(list.size()-1);
    }

    private void upHeap(int index){
        int parent = parent(index);
//        System.out.println("Parent "+list.get(parent));
        if(list.get(index).compareTo(list.get(parent))>0){
            swap(index, parent);
            upHeap(parent);
        }
    }

    public T remove() throws Exception {
        if(list.isEmpty()){
            throw new Exception("Heap is empty");
        }
        T temp =  list.get(0);
        T last = list.remove(list.size()-1);
        if(!list.isEmpty()){
            list.set(0, last);
        }
        downHeap(0);


        return temp;
    }

    private void downHeap(int index){
        int max = index;
        int left = left(index);
        int right = right(index);

        if(left<list.size() && list.get(left).compareTo(list.get(max))>0){
            max = left;
        }

        if(right<list.size() && list.get(right).compareTo(list.get(max))>0){
            max = right;
        }

        if (max!=index){
            swap(max, index);
            downHeap(max);
        }
    }

    public ArrayList<T> sort() throws Exception {
        ArrayList<T> ans = new ArrayList<>();
        while (!list.isEmpty()){
            ans.add(this.remove());
        }
        return ans;
    }


    public void print(){
        System.out.println(list);
    }
}
