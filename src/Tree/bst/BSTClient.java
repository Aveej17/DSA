package Tree.bst;

public class BSTClient {

    public static void main(String[] args) {
        BST bst = new BST();
//        bst.insert(15);
//        bst.insert(12);
//        bst.insert(8);
//        bst.insert(10);
//
//        bst.insert(20);
//        bst.insert(19);
//        bst.insert(30);
//        bst.insert(45);
//        bst.insert(4);
//
//
////        bst.display();
//
//        System.out.println(bst.balanced());
//
//        BST bst1 = new BST();
//        bst1.insert(2);
//        bst1.insert(1);
//        bst1.insert(3);
////        bst1.display();
//        System.out.println(bst1.balanced());
//
//
//        BST bst2 = new BST();
//        bst2.populate(new int[]{15, 12, 8, 10, 20, 30, 45});
//        bst2.display();
//        System.out.println(bst2.balanced());

        int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        bst.insertSorted(a);
        bst.display();
        System.out.println(bst.balanced());
        bst.levelOrderTraversal();
        System.out.println(bst.levelOrderTraversal().toString());

        BST b = new BST();
        System.out.println(b.levelOrderTraversal().toString());
     }
}
