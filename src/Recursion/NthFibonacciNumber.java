package Recursion;

public class NthFibonacciNumber {
    public static void main(String[] args) {

        System.out.println(fibo(20));
    }

    private static int fibo(int n) {
//        if (n==1){
//            return 1;
//        }
//        if(n==0){
//            return 0;
//        }
        if(n<2){
            return n;
        }
//        System.out.println("HI");
        return fibo(n-1)+fibo(n-2);
    }
}
