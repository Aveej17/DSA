package LinkedList.CLL;

public class Client {
    public static void main(String[] args) {
        CLL cll = new CLL();
        cll.display();
        cll.insertFirst(8);
        cll.display();
        cll.insertFirst(7);
        cll.display();
        cll.insertLast(9);
        cll.display();
        cll.insertFirst(6);
        cll.display();
        cll.delete(8);
        cll.display();
        cll.delete(6);
        cll.display();
        cll.delete(9);
        cll.display();
        cll.delete(10);
        cll.display();
    }
}
