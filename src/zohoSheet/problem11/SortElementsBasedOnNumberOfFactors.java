package zohoSheet.problem11;

import java.util.Arrays;
import java.util.Comparator;

public class SortElementsBasedOnNumberOfFactors {
    int num;
    int factors;

    SortElementsBasedOnNumberOfFactors(int num, int factors){
        this.num = num;
        this.factors = factors;
    }

    static int countFactors(int n)
    {
        int count = 0;
        int sq = (int)Math.sqrt(n);

        // if the number is a perfect square
        if (sq * sq == n)
            count++;

        // count all other factors
        for (int i=1; i<Math.sqrt(n); i++)
        {
            // if i is a factor then n/i will be
            // another factor. So increment by 2
            if (n % i == 0)
                count += 2;
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = {5, 11, 10, 20, 9, 16, 23};
        sort(arr);

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void sort(int [] nums){
        SortElementsBasedOnNumberOfFactors [] array = new SortElementsBasedOnNumberOfFactors[nums.length];

        for(int i = 0; i<nums.length; i++){
            array[i] = new SortElementsBasedOnNumberOfFactors(nums[i], countFactors(nums[i]));
        }

//        Arrays.sort(array, (o1, o2) -> {
//            if(o1.factors == o2.factors){
//                return o1.num-o2.num;
//            }
//            return o2.factors - o1.factors;
//        });
        sorting(array);

        for(int i = 0; i<nums.length; i++){
            nums[i] = array[i].num;
        }

    }

    public static void sorting(SortElementsBasedOnNumberOfFactors[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    private static void mergeSort(SortElementsBasedOnNumberOfFactors[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Sort first and second halves
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            // Merge the sorted halves
            merge(array, left, mid, right);
        }
    }

    private static void merge(SortElementsBasedOnNumberOfFactors[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays
        SortElementsBasedOnNumberOfFactors[] L = new SortElementsBasedOnNumberOfFactors[n1];
        SortElementsBasedOnNumberOfFactors[] R = new SortElementsBasedOnNumberOfFactors[n2];

        // Copy data to temporary arrays
        System.arraycopy(array, left, L, 0, n1);
        System.arraycopy(array, mid + 1, R, 0, n2);
        

        // Merge the temporary arrays

        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i].factors >= R[j].factors) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }
}
