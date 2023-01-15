package algorithms.sort.insertion;

import algorithms.sort.selctionsort.SelectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myArray = {4, 2, 6, 5, 1, 3};
        InsertionSort.InsertionSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
