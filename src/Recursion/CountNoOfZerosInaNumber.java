package Recursion;

public class CountNoOfZerosInaNumber {

    public static void main(String[] args) {
        System.out.println(noOfZeros(9080090));
    }

    public static int noOfZeros(int n){
        return helper(n, 0);
    }
    public static int helper(int n, int count){
//        if(n%10 == 0 && n > 0){
//            count++;
//        }
//        else if (n<10) {
//            return count;
//        }
        if(n==0){
            return count;
        }
        if(n%10 == 0){
//            count++;     // uncomment this line and comment the below line both are same
            return helper(n/10, count+1);
        }

        return helper(n/10, count);
    }
}
