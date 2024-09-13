package Recursion;

public class NumbersExampleRecursion {
    public static void main(String[] args) {
        print(1);
    }

    public static void print(int i){
        if(i > 5){
            return;
        }
        System.out.println(i);
        print(i+1);

    }
}
