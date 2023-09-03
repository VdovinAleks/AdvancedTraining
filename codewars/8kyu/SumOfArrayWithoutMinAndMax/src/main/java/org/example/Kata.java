package org.example;

public class Kata {
    public static int Sum(int[] numbers) {
        if (numbers == null || numbers.length == 1 || numbers.length == 0) {
            return 0;
        }
        int minIndex = 0;
        int maxIndex = 0;
        int sum = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[maxIndex] < numbers[i + 1]) {
                maxIndex = i + 1;
            } else if (numbers[minIndex] > numbers[i + 1]) {
                minIndex = i + 1;
            }
        }
        System.out.println("min -> " + minIndex + "\nmax -> " + maxIndex);
        for (int i = 0; i < numbers.length; i++) {
            if (i != minIndex && i != maxIndex) {
                sum = sum + numbers[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = null;
        System.out.println(Sum(arr));
    }
}
