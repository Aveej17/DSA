//package DP;
//
//import java.util.Stack;
//
//public class LeetCode1047 {
//    public static void main(String[] args) {
//        String s = "abbaca";
//        String ans = RemoveAllAdjacentDuplicatesFromString(s);
//        System.out.println(ans);
//    }
//
//    private static String RemoveAllAdjacentDuplicatesFromString(String s) {
//
//        Stack<String> stack = new Stack<>();
//        for(char chr: s.toCharArray()){
//
//            if(!stack.isEmpty() && stack.peek().ordinal() ==(int)chr){
//                stack.pop();
//            }
//            else{
//                stack.push(String.valueOf(chr));
//            }
//        }
//        Stack<String> Ans = new Stack<>();
//
//        while (!stack.isEmpty()){
//            Ans.push(stack.pop());
//        }
//        String ans= "";
//        while (!Ans.isEmpty()){
//            ans +=Ans.pop();
//        }
//        return ans;
//    }
//}
