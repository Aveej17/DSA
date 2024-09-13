package LinkedList.CLL;

public class CLL {


    private Node head;

    private Node tail;
    public int size;

    public CLL(){

    }

    public Node insertFirst(int val){
        Node node = new Node(val);

        if(head == null){
            head = node;
            tail = node;
        }
        node.next = head;
        tail.next = node;
        head = node;
        return head;
    }

    public Node insertLast(int val){
        Node node = new Node(val);

        if(head == null){
            head = node;
            tail = node;
        }
        node.next = head;
        tail.next = node;
        tail = node;
        return head;
    }

    public Node delete(int val){
        Node node = head;
        if (node == null) {
            return null;
        }

        if (head == tail){
            head = null;
            tail = null;
            return null;
        }

        if (node.val == val) {
            head = head.next;
            tail.next = head;
            return head;
        }

        do {
            Node temp = node.next;
            if (temp.val == val) {
                node.next = temp.next;
                break;
            }
            node = node.next;
        } while (node != head);
        return head;
    }

    public void display(){
        if(head == null){
            System.out.println("null");
            return;
        }
        Node temp = head;
        if(head != null) {
            do{
                System.out.print(temp.val+"->");
                temp=temp.next;
            }while (temp!=head);
        }
        System.out.println(" I am connecting to head which has value of "+tail.next.val);
    }


    private static class Node{
        private final int val;
        private Node next;

        private Node(int val) {
            this.val = val;
        }
    }
}
