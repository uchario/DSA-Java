package datastructures;

import datastructures.Classes.Cookie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] input = {1, 3, 1, 3, 2, 1};
        int[] result = solution(input);
        printArray(result);
    }

    public static int[] solution(int[] target) {
        ArrayList<Integer> temp = new ArrayList<>();

        for(int i = 0; i < target.length; i++) {
            if(i == 0 || i == (target.length - 1) || target[i] > Math.max(target[i - 1], target[i + 1])) {
                temp.add(target[i]);
            }
        }

        int[] result = new int[temp.size()];

        IntStream.range(0, result.length)
                .forEach((i) -> {
                    result[i] = temp.get(i);
                });

        return result;
    }

    public static void printArray(int[] array) {
        Arrays.stream(array)
                .forEach((item) -> {
                    System.out.println(item);
                });
    }
}