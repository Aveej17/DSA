package Heap.maxHeap;

public class Client {
    public static void main(String[] args) throws Exception {
        Heap<Integer> heap = new Heap<Integer>();

        heap.add(3);
        heap.add(10);
        heap.print();
        heap.add(40);
        heap.add(4);
        heap.add(5);
        heap.add(23);



//        heap.print();
//        System.out.println(heap.remove());

//        heap.print();
//        System.out.println(heap.remove());
//        heap.print();
//        System.out.println(heap.remove());
//        heap.print();
        System.out.println(heap.sort());
//
//        Heap<Double> heap1 = new Heap<Double>();
//        heap1.add(17.9);
//        heap1.print();
//        heap1.add(12.3);
//        heap1.print();
//        heap1.add(67.0);
//        heap1.print();
//        System.out.println(heap1.remove());

    }
}
