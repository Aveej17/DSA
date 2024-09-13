package Tree.bst;

public class Node{
    private int value;
    private int height;
    Node left;
    Node right;

    public Node(int value){
        this.value = value;
    }

    public void setHeight(int value){
        this.height = value;
    }
    public int getValue(){
        return value;
    }
    public int getHeight(){
        return height;
    }
}
