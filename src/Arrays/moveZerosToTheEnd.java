package Arrays;

import java.util.Arrays;

public class moveZerosToTheEnd {
    public static void main(String[] args) {
        int [] a = {7, 93, 0, 8, 15, 0, 0, 0, 0, 0, 26, 0, 0, 0, 43, 90, 2, 0, 0, 0, 58, 94, 77, 45, 59, 19, 0, 0, 98, 0, 0, 0, 0, 0, 88, 0, 0, 0};


        moveZeros(a.length, a);
        System.out.println(Arrays.toString(a));

    }
        public static void moveZeros(int n, int [] a) {
        // Write your code here.
        int j = nonZeroIndex(a, 0, n);
        for(int i = 0; i<n; i++) {
            if (a[i] == 0 && a[j]!=0) {
                a[i] = a[j];
                a[j] = 0;
                if (j < n - 1) {
                    j = nonZeroIndex(a, j, n);
                }
            }
        }
        }
        private static int nonZeroIndex(int [] arr, int start, int length){
            if(arr[start] == 0) {
                while (start < length - 1) {
                    if (arr[start] != 0) {
                        return start;
                    }
                    start++;
                }
            }
            else{
                while (start < length - 1) {
                    if(arr[start] == 0){
                        while (start < length - 1) {
                            if (arr[start] != 0) {
                                return start;
                            }
                            start++;
                        }
                    }
                    else {
                        start++;
                    }
                }

            }
            return length-1;
        }
}