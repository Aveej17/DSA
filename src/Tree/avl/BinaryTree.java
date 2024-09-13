package Tree.avl;

public class BinaryTree {
    private Node root;

    public BinaryTree(){
        root = null;
    }

    public BinaryTree(int value){
        root = new Node(value);
    }

    private int  height(Node node){
        if(node == null){
            return -1;
        }
        return node.getHeight();
    }

    public void height(){
        System.out.println(height(root));
    }

    public void isBalanced(){
        System.out.println(isBalanced(root));
    }

    private boolean isBalanced(Node node){
        if(node == null){
            return true;
        }
        return  Math.abs(height(node.getLeft())-height(node.getRight()))<=1 && isBalanced(node.getLeft()) && isBalanced(node.getRight());
    }

    public void insert(int value){
        root = insert(value, root);
    }

    private Node insert(int value, Node node){
        if(node == null){
            return new Node(value);
        }

        if(value<node.getValue()){
            node.setLeft(insert(value, node.getLeft()));
        }
        if(value>node.getValue()){
            node.setRight(insert(value, node.getRight()));
        }
        node.setHeight(Math.max(height(node.getLeft()), height(node.getRight()))+1);

        // making the tree self balanced
        return rotate(node);
    }

    private Node rotate(Node node){
        if(height(node.getLeft())-height(node.getRight())>1){
            // left heavy
            if(height(node.getLeft().getLeft())-height(node.getLeft().getRight())>0){
                // left left case
                return rightRotate(node);
            }

            if(height(node.getLeft().getLeft())-height(node.getLeft().getRight())<0){
                // left right case
                node.setLeft(leftRotate(node.getLeft()));
                return rightRotate(node);
            }

        }

        if(height(node.getLeft())-height(node.getRight())<-1){
            // left heavy
            if(height(node.getRight().getLeft())-height(node.getRight().getRight())<0){
                // right right case
                return leftRotate(node);
            }

            if(height(node.getRight().getLeft())-height(node.getRight().getRight())>0){
                // right left case
                node.setRight(rightRotate(node.getRight()));
                return leftRotate(node);
            }

        }
        return node;
    }

    private Node rightRotate(Node node){
        Node temp = node.getLeft();
        node.setLeft(temp.getRight());
        temp.setRight(node);
        node.setHeight(Math.max(height(node.getLeft()), height(node.getRight())+1));
        temp.setHeight(Math.max(height(temp.getLeft()), height(temp.getRight())+1));
        return temp;
    }

    private Node leftRotate(Node node){
        Node temp = node.getRight();
        node.setRight(temp.getLeft());
        temp.setLeft(node);
        node.setHeight(Math.max(height(node.getLeft())+1, height(node.getRight())));
        temp.setHeight(Math.max(height(temp.getLeft())+1, height(temp.getRight())));
        return temp;
    }


    public void display(){
        display(root, "Root Node : ");
    }

    private void display(Node node, String details){
        if(node == null){
            return;
        }

        System.out.println(details + node.getValue());
        display(node.getLeft(), "left child of "+ node.getValue()+" is : ");
        display(node.getRight() , "right child of "+ node.getValue()+" is : ");
    }


    public void prettyDisplay(){
        prettyDisplay(root, 0);
    }

    public void prettyDisplay(Node node, int level){
        if(node==null){
            return;
        }

        prettyDisplay(node.getRight(), level+1);

        if(level!=0){
            for(int i = 0; i<level-1; i++){
                System.out.print("|\t\t");
            }
            System.out.println("|------> "+node.getValue());
        }
        else{
            System.out.println(node.getValue());
        }
        prettyDisplay(node.getLeft(), level+1);
    }


}
