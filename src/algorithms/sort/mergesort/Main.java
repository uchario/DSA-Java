package algorithms.sort.mergesort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] originalArray = {3, 1, 4, 2};
        int[] sortedArray = MergeSort.mergeSort(originalArray);

        System.out.println("\nOriginal array" + Arrays.toString(originalArray));
        System.out.println("\nSorted array" + Arrays.toString(sortedArray));
    }
}
