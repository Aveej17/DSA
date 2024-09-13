package Tree.binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
    private static class Node{
        int value;
        Node left;
        Node right;

        Node(int value){
            this.value = value;
        }
    }

    public BinaryTree(){
    }

    private Node root;


    public void insert(Scanner scanner){
        System.out.println("Enter the root Node: ");
        int value = scanner.nextInt();

        root = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter the left of node: "+node.value);
        String left = scanner.next();
        if(left.equals("y")){
            System.out.println("Enter the value of the left of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter the right of node: "+node.value);
        String right = scanner.next();
        if(right.equals("y")){
            System.out.println("Enter the value of the right of " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    public void display(){
        display(root, "");
    }

    private void display(Node root, String indent){
        if(root == null){
            return;
        }
        System.out.println(indent+root.value);
        display(root.left, indent+"\t");
        display(root.right, indent+"\t");

    }






    public int valueSuccessor(int data){
        return valueSuccessor(root, data);
    }

    private int valueSuccessor(Node node, int data){
        if(node== null){
            return 0;
        }

        Queue<Node> q = new LinkedList<>();
        if (node.right!=null)
            q.offer(node.right);
        if (node.left!=null)
            q.offer(node.left);
        int prev = node.value;
        while(!q.isEmpty()){

            Node curr = q.poll();
            if(prev == data){
                return curr.value;
            }
            if(curr.left!=null){
                q.offer(curr.left);
            }
            if(curr.right!=null){
                q.offer(curr.right);
            }
            prev = curr.value;
        }
        return 0;
    }

    public void prettyDisplay(){
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level){
        if (node == null){
            return;
        }

        prettyDisplay(node.right, level+1);

        if(level!=0){
            for(int i = 0; i<level-1; i++){
                System.out.print("|\t\t");
            }
            System.out.println("|------> "+node.value);
        }
        else{
            System.out.println(node.value);
        }
        prettyDisplay(node.left, level+1);
    }
}
