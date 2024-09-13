package LinkedList.DLL;

public class Client {
    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.displayNormal();
        dll.displayRev();
        dll.insertFirst(4);

        dll.displayNormal();
        dll.displayRev();

        dll.insertFirst(3);

        dll.displayNormal();
        dll.displayRev();

        dll.insertLast(5);
        dll.displayNormal();
        dll.displayRev();

        dll.insertLast(6);
        dll.displayNormal();
        dll.displayRev();



        dll.insertAt(0, 2);
        dll.displayNormal();

        dll.insertAt(5, 7);
        dll.displayNormal();

        dll.insertAt(6, 9);
        dll.displayNormal();

        dll.insertAt(6, 8);
        dll.displayNormal();

        dll.displayRev();

        dll.insertFirst(1);
        dll.displayNormal();
        dll.displayRev();

    }
}
