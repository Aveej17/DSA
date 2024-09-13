package DP;

import java.util.Arrays;
import java.util.Scanner;

class PAIR {
    int first;
    int second;

    PAIR(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

public class BUILDINGBRIDGES {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of pairs you want to give: ");
        int t = sc.nextInt();
        PAIR[] p = new PAIR[t];
        for(int i = 0; i<t; i++){
            System.out.println("Enter "+ (i+1) + " Pair");
            p[i] = new PAIR(sc.nextInt(), sc.nextInt());

        }
        sc.close();


        Arrays.sort(p, (o1, o2) -> {
            if (o1.first != o2.first) {
                return Integer.compare(o1.first, o2.first);
            } else {
                return Integer.compare(o1.second, o2.second);
            }
        });

//        for (PAIR s : p) {
//            System.out.println(s.first + " f  " + s.second + " s");
//        }
        int [] array = new int [p.length];
        for(int i = 0; i<p.length; i++){
            array[i] = p[i].second;
        }

        System.out.println(LIS.lisEfficient(array));


    }
}
