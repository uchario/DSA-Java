package algorithms.sort.quicksort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myArray = {4, 6, 1, 7, 3, 2, 5};
        QuickSort.quickSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }

}
