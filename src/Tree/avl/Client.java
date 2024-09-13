package Tree.avl;

public class Client {

    public static void main(String[] args) {
        BinaryTree avl = new BinaryTree();
        for(int i = 0; i<1000; i++){
            avl.insert(i);
        }
        avl.height();
        avl.prettyDisplay();
//        avl.isBalanced();
//        avl.display();
//        avl.insert(1);
//        avl.insert(12);
//        avl.insert(14);
//        avl.insert(6);
//
//        avl.isBalanced();
//        avl.display();
//
//
//        BinaryTree avl1 = new BinaryTree(10);
//        avl1.isBalanced();
//        avl1.display();

//        BinaryTree k = new BinaryTree();
//        k.insert(12);
//        k.insert(11);
//        k.insert(10);
//        k.insert(100);
//        k.insert(9);
//        k.insert(8);
//        k.insert(107);
//        k.insert(17);
//        k.insert(78);
//        k.insert(79);
//        k.insert(80);
//        k.insert(81);
//        k.insert(89);
//        k.insert(90);
//        k.insert(189);
//        k.height();




//        k.display();
//        k.prettyDisplay();
    }
}
