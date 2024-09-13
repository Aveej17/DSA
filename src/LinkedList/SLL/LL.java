package LinkedList.SLL;

public class LL {
    public int size;

    public Node head;
    private Node tail;

    public LL(int val) {
        head = new Node(val);
        tail = head;
        size = 1;
    }

    public LL(){
        this.size = 0;
    }

    public void displayLast() {
        System.out.println(tail.val);
    }





    public void display() throws InterruptedException {
        Node temp = head;
        while (temp!=null){
//            Thread.sleep(1000);
            System.out.print(temp.val+"-> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    public boolean checkForLoop(){
        Node slow = head;
        Node fast = head;
        while (fast!=null&&fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;
            if(fast == slow){
                System.out.println(count(slow, fast));

                return true;
            }
        }
        return false;
    }


    public int count(Node slow, Node fast){
        int no = 0;
        do{
            slow = slow.next;
            no++;
        }while (slow!=fast);
        return no;
    }

    public int loopLength(){
        Node slow = head;
        Node fast = head;
        while (fast!=null&&fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;
            if(fast == slow){
                int no = 0;
                do{
                    slow = slow.next;
                    no++;
                }while (slow!=fast);
                return no;
            }
        }
        return 0;
    }

    public int   checkForLoopStart(){
        int length = 0;
        Node slow = head;
        Node fast = head;
        while (fast!=null&&fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;
            if(fast == slow){
                length = count(slow, fast);
                break;
            }
        }
        // find the start of Loop;

        Node f = head;
        Node s = head;
        while(length>0){
            s = s.next;
            length--;
        }

        while (f!=s){
            f = f.next;
            s = s.next;
        }
        return f.val;

    }




    public Node insertFirst(int val){
        Node node = new Node(val);
        if(head == null){
            head=node;
            tail = node;
            size++;
            return head;
        }
        node.next=head;
        head  = node;
        size++;
        return head;
    }

    public void length() {
        System.out.println(size);
    }

    public Node insertLast(int val) {
        Node node = new Node(val);
        if(tail == null){
            head =node;
            tail = node;
            size++;
            return head;
        }
        tail.next = node;
        tail = node;
        size++;
        return head;
    }

    public Node insertAt(int val, int pos) {
        if(size==0){
            insertFirst(val);
            return head;
        }
        if(size<=pos){
            insertLast(val);
            return head;
        }

        Node node = new Node(val);
        Node temp = head;
        int index=1;
        while(index<pos){
            temp = temp.next;
            index++;
        }
        size++;
        node.next=temp.next;
        temp.next=node;
        return head;
    }

    public void deleteFirst() {
        if(size <=1){
            head = null;
            tail = null;
            size--;
            return;
        }
        head = head.next;
        size--;
    }

    public void deleteLast() {
        if(size <=1){
            head = null;
            tail = null;
            size--;
            return;
        }
        if (size==2){
            head.next = null;
            tail=head;
            size--;
            return;
        }
        Node temp = head;
        while (temp.next.next!=null){
            temp=temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }

    public void deleteAt(int pos) {
        if(size < pos){
            deleteLast();
        }
        Node temp = head;
        int index = 1;
        while (index<pos-1){
            pos--;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;

    }


    // Rec Insertion
    public Node recursiveInsertion(int pos, int val){
        if(pos>=size){
            insertLast(val);
            return head;
        }
        if(head == null || pos == 0){
            insertFirst(val);
            return head;
        }
        return helper(pos, val, head);
    }

    public Node helper(int pos, int val, Node node){
        if(pos == 1){
            Node temp = new Node(val);
            temp.next = node.next;
            node.next = temp;
            size++;
            return node;
        }
        Node n = helper(pos-1, val, node.next);
        return n;
    }



    public void makeAsCycle(int val) {
        Node temp = head;
        while (val>0){
            temp = temp.next;
            val--;
        }
        tail.next=temp;
        System.out.println(temp.val+"temp");
    }

    public void pairSwap() {

        if(head == null || head.next == null){
            return;
        }

        Node curr = head;
        head= head.next;
//        189-> 4-> 10-> 19-> 6-> 9-> 7-> 19-> 200-> END
        while(curr!=null && curr.next!=null){
            Node temp = curr.next;
            curr.next = temp.next;
            temp.next = curr;
            curr = curr.next;

            if(curr!=null && curr.next!=null){
                temp.next.next = curr.next;
            }
        }
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }


    public void bubbleSort() {
        bubbleSort(size - 1, 0);
    }

    private void bubbleSort(int row, int col) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            Node first = get(col);
            Node second = get(col + 1);

            if (first.val > second.val) {
                // swap
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col + 1);
        } else {
            bubbleSort(row - 1, 0);
        }
    }

    private static class Node{
        private final int val;
        private Node next;


        private Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
        private Node(int val){
            this.val = val;
        }
    }
}
