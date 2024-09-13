package LinkedList.DLL;

public class DLL {

    private Node head;
    private Node tail;
    int size;
    public DLL(){
        this.size = 0;
    }

    public void displayNormal(){
        Node temp = head;
        if(temp == null){
            return;
        }
        while(temp!=null){
            System.out.print(temp.val+"-> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public void displayRev(){
        Node temp = tail;
        if(temp == null){
            return;
        }
        while(temp!=null){
            System.out.print(temp.val+"-> ");
            temp = temp.prev;
        }
        System.out.println("END");
    }

    public Node insertFirst(int val){

        Node temp = new Node(val);
        if(head == null){
            head = temp;
            tail = head;
            size++;
            return head;
        }

        temp.next = head;
        head.prev = temp;
        head = temp;
        size++;
        return head;
    }

    public Node insertLast(int val){

        Node temp = new Node(val);
        if(tail == null){
            head = temp;
            tail = head;
            size++;
            return head;
        }

        tail.next = temp ;
        temp.prev = tail;
        tail = temp;
        size++;
        return head;
    }

    public Node insertAt(int pos, int val){
        if(size==0 || pos == 0){
            insertFirst(val);
            return head;
        }
        if(pos>=size){
            insertLast(val);
            return head;
        }
        Node node = new Node(val);

        Node temp = head;

        for(int i = 1; i<pos; i++){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next.prev = node;
        temp.next = node;
        node.prev = temp;
        return head;
    }


    private static class Node{
        private final int val;
        private Node prev;
        private Node next;

        private Node(int val) {
            this.val = val;
        }
        private Node(int val, Node next, Node prev){
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }
}
