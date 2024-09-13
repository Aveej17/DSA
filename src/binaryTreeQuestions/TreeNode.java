package binaryTreeQuestions;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public List<TreeNode> allPossibleFBT(int n) {
        if(n%2 == 0){
            return new ArrayList<>();
        }

        return solve(n);
    }

    public static List<TreeNode> solve(int n){
//        HashMap<Integer, TreeNode> map = new HashMap<>();
        if(n==1){
            List<TreeNode> tempResult = new ArrayList<>();
            TreeNode root = new TreeNode(0);
            tempResult.add(root);
            return tempResult;
        }
//        if(map.containsKey(n)){
//            return map.get(n);
//        }
        List<TreeNode> result = new ArrayList<>();
        for(int i = 1; i<n; i+=2){
            List<TreeNode> leftAllFBT = solve(i);
            List<TreeNode> rightAllFBT = solve(n-i-1);

            for(TreeNode l: leftAllFBT){
                for(TreeNode r: rightAllFBT){
                    TreeNode root = new TreeNode(0);
                    root.left = l;
                    root.right = r;
                    result.add(root);
                }
            }

        }
        return result;
    }
}

