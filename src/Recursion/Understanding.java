package Recursion;

public class Understanding {

    public static void main(String[] args) {
        message();
    }


    public static void  message(){
        System.out.println("Hello World");
        message1();
    }

    public static void  message1(){
        System.out.println("Hello World");
        message2();
    }
    public static void  message2(){
        System.out.println("Hello World");
        message3();
    }
    public static void  message3(){
        System.out.println("Hello World");
        message4();
    }
    public static void  message4(){
        System.out.println("Hello World");
    }
}
