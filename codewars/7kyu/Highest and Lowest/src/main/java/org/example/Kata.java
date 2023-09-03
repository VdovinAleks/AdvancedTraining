package org.example;

public class Kata {
    public static String highAndLow(String numbers) {
        String[] arr = numbers.split(" ");
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Integer.parseInt(arr[minIndex]) >= Integer.parseInt(arr[i])) {
                minIndex = i;
            }
            if (Integer.parseInt(arr[maxIndex]) <= Integer.parseInt(arr[i])) {
                maxIndex = i;
            }

        }
        return arr[maxIndex] + " " + arr[minIndex];
    }

    public static void main(String[] args) {
        String first = "1 2 3 -3 5 6";
        String second = "0 10 -13 3 56 6";
        System.out.println(highAndLow(second));

    }
}
