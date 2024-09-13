package Tree.binaryTree;

import java.util.Scanner;

public class clientBT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        bt.insert(scanner);
        bt.display();
        bt.prettyDisplay();
    }
}
