package org.example;

import java.util.stream.IntStream;

public class Solution {
    public static int SmallestIntegerFinder(int[] args) {
       return IntStream.of(args).min().getAsInt();
    }

    public static void main(String[] args) {
        int[] arr = {1, -5, -33, 0, 12, 56};
        System.out.println(SmallestIntegerFinder(arr));
    }
}
