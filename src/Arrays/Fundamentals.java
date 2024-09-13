package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Fundamentals {

//    int [] rnos = new int[5];

//    int [] rnos2 = {23, 2, 45, 32, 15};
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Dynamic Allocation
        int [] ros; // reference variable created in stack  declaration->  compile time
        ros = new int[5]; // allocation run time objects created in heap memory -> runtime

        // new keyword -> new is used to create an object
        System.out.println(ros[0]);

        String []arr = new String[4];
        System.out.println(arr[0]);

        for(int i = 0; i<ros.length-1; i++){
//            System.out.println("Enter the number to store in ros pos "+i);
//            arr[i] = String.valueOf(in.nextInt());
            arr[i] = String.valueOf(i+10);
        }
        for(int num : ros){
            System.out.println(num);
        }
        System.out.println(Arrays.toString(ros));

        arr[0] = "Jeeva";

        System.out.println(Arrays.toString(arr));
    }
}

