package Tree.bst;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BST {
    private Node root;
    public BST(){
        root = null;
    }
    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.getHeight();
    }
    public boolean isEmpty(){
        return root == null;
    }

    public void display(){
        display(root, "Root Node: ");
    }

    private void display(Node node, String details){
        if (node == null){
            return;
        }

        System.out.println(details+node.getValue());

        display(node.left , "left child of "+ node.getValue()+" : ");
        display(node.right , "right child of "+ node.getValue()+" : ");
    }

    public void insert(int value){
        root = insert(value, root);

    }

    private Node insert(int value, Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }

        if(node.getValue()>value){
            node.left = insert(value, node.left);
        }

        if(node.getValue()<value){
            node.right = insert(value, node.right);
        }
        node.setHeight(Math.max(height(node.left), height(node.right))+1);
        return node;
    }

    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node){
        if (node== null)
            return true;
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void populate(int [] nums){
        for (int i = 0; i<nums.length; i++){
            insert(nums[i]);
        }
    }

     public void insertSorted(int [] nums){
        insertSorted(nums, 0, nums.length-1);
    }

    private void insertSorted(int [] nums, int initial, int end){
        if(initial>end){
            return;
        }
        int mid = initial + (end-initial)/2;
        insert(nums[mid]);
        insertSorted(nums, initial, mid-1);
        insertSorted(nums,mid+1, end);
    }


    public List<List<Integer>> levelOrderTraversal(){

        List<List<Integer>> k = levelOrderTraversal(root);
//        for(List i: k){
//            System.out.println(i);
//        }
        return k;
    }

    private List<List<Integer>> levelOrderTraversal(Node  node){

        if(node == null){
            System.out.println("Tree doesn't have nodes");
            return new ArrayList<>();
        }

        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            int n = queue.size();
            List<Integer> l = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                Node temp = queue.remove();
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
                l.add(temp.getValue());
            }
            ans.add(l);
        }
        return ans;
    }

}
