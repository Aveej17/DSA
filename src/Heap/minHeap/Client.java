package Heap.minHeap;

public class Client {

    public static void main(String[] args) throws Exception {
        Heap<Integer> heap = new Heap<>();
        heap.add(8);

        heap.add(89);
        heap.add(87);
        heap.add(78);
        heap.add(90);
        heap.add(1);
        System.out.println(heap.sort());
//        heap.print();
//        System.out.println(heap.remove());
//        heap.add(6);
//        heap.print();
//        System.out.println(heap.remove());
//        heap.print();
//        System.out.println(heap.remove());
//        System.out.println(heap.remove());
//        System.out.println(heap.remove());


    }
}
