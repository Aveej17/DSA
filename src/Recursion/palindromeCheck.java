package Recursion;

public class palindromeCheck {

    public static void main(String[] args) {
        System.out.println(checkPal("13131"));
    }
    public static Boolean checkPal(String s){

        return helper(0,  s.length()-1, s);

    }
    public static boolean helper(int start, int end, String s){
        if(start>end){
            return true;
        }
        if(s.charAt(start) != s.charAt(end)){
            return false;
        }
        return helper(++start, --end, s);
    }
}
