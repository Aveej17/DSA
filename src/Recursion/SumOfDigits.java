package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
//        System.out.println(sumOfDigits(1342));
//        reverseANumber(1432);
//        System.out.println(sum);
        System.out.println(revNumber(1342));
    }

    public static int sumOfDigits(int n){
        if (n<10){
            return n;
        }
        return n%10+sumOfDigits(n/10);
    }

    static int sum = 0;
    static void reverseANumber(int n){
        if (n==0){
            return;
        }
        int remider = n % 10;
        sum = (sum*10)+remider;
        reverseANumber(n/10);
    }


    static int revNumber(int n){
        int digits = (int) Math.log10(n)+1;

        return helper(n, digits);
    }

    static  int helper(int n, int digits){
        if(n<10){
            return n;
        }
        return (n%10)* (int) Math.pow(10,digits-1) + helper(n/10, digits-1);
    }
}
