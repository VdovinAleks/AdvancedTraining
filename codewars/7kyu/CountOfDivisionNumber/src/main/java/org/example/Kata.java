package org.example;

public class Kata {
    public static long numberOfDivisors(int n) {
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                count += 1;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numberOfDivisors(750));
    }
}
