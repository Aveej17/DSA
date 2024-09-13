package LinkedList.SLL;

import java.util.LinkedList;
import java.util.List;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        LL list = new LL();

        list.insertFirst(4);
        list.display();
         list.recursiveInsertion(19, 19);
        list.display();
        list.recursiveInsertion(2, 7);
        list.display();
        list.recursiveInsertion(2, 9);
        list.display();
        list.recursiveInsertion(1, 10);
        list.display();
        list.recursiveInsertion(3, 6);
        list.display();
        list.length();
        list.recursiveInsertion(7, 19);
        list.recursiveInsertion(0, 189);
        list.display();
        list.insertLast(200);
        list.display();
        list.pairSwap();
        list.display();


        list.makeAsCycle(4);
        System.out.println(list.checkForLoop());
        System.out.println(list.checkForLoopStart());


//        list.display();
//        list.length();
//        list.insertAt(87,89);
//        list.display();
//        list.insertFirst(4);
//        list.display();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.display();
//        list.deleteAt(3);
//        list.display();
//        list.insertFirst(1);
//        list.insertFirst(5);
//        list.display();
//        list.insertAt(8, 2);
//        list.display();
////        list.displayLast();
////        list.length();
//        list.insertLast(7);
//        list.insertAt(100, 100);
//        list.display();
//        list.deleteFirst();
//        list.display();
//
//        LL l = new LL(4);
//        l.length();
//        l.display();
//        l.insertAt(8, 8);
//        l.length();
//        l.display();
//        l.insertAt(78, 78);
//        l.length();
//        l.display();
//        l.length();
//        l.deleteFirst();
//        l.length();
//        l.display();
//        l.length();
//        l.insertAt(3, 1);
//        l.length();
//        l.display();
//        l.displayLast();
//        l.deleteLast();
//        l.display();
//        l.deleteLast();
//        l.display();
//        l.deleteLast();
//        l.display();

    }
}
