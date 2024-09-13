package Tree.segmentTrees;


public class SBT {

    private static class Node{
        int data;
        int startInterval;
        int endInterval;

        Node left;
        Node right;


        public Node(int startInterval, int endInterval){
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    Node root;

    public SBT(int [] arr){
        // create a tree using arr

        this.root = constructTree(arr, 0, arr.length-1);
    }

    private Node constructTree(int [] arr, int start, int end){
        if(start==end){
            // leaf Node
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }
        // create a new node with index currently we are at

        Node node = new Node(start, end);

        int mid = start+(end-start)/2;

        node.left = constructTree(arr, start, mid);
        node.right = constructTree(arr, mid+1, end);

        node.data = node.left.data*node.right.data;
        return node;
    }



    //query
    public int query(int qsi, int qei){
        return this.query(this.root, qsi, qei);
    }

    private int query(Node node, int qsi, int qei){
        if(node.startInterval>=qsi && node.endInterval<=qei){
            return node.data;
        }else if(node.startInterval>qei || node.endInterval<qsi){
            return 1;  // default Value which is not affecting out output
        }
        else{
            return this.query(node.left, qsi, qei)*this.query(node.right, qsi, qei);
        }
    }



    public void update(int index, int data){
        this.root.data = update(root, index, data);
    }

    private int update(Node node, int index, int data){
        if(index >= node.startInterval && index <= node.endInterval) {
            if (index == node.startInterval && index == node.endInterval) {
                node.data = data;
                return node.data;

            } else {
                int left = update(node.left, index, data);
                int right = update(node.right, index, data);
                node.data = left * right;
                return node.data;
            }
        }
        return node.data;
    }


    public void display() {
        display(this.root);
    }
    private void display(Node node) {
        String str = "";

        if(node.left != null) {
            str = str + "Interval=[" + node.left.startInterval + "-" + node.left.endInterval + "] and data: " + node.left.data + " => ";
        } else {
            str = str + "No left child";
        }

        // for current node
        str = str + "Interval=[" + node.startInterval + "-" + node.endInterval + "] and data: " + node.data + " <= ";

        if(node.right != null) {
            str = str + "Interval=[" + node.right.startInterval + "-" + node.right.endInterval + "] and data: " + node.right.data;
        } else {
            str = str + "No right child";
        }

        System.out.println(str + '\n');

        // call recursion
        if(node.left != null) {
            display(node.left);
        }

        if(node.right != null) {
            display(node.right);
        }
    }



}
