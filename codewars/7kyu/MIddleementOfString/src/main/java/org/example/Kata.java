package org.example;

public class Kata {
    public static String getMiddle(String word) {
        if (word.length() % 2 == 0) {
            return word.charAt(word.length()/2-1) + String.valueOf(word.charAt(word.length() / 2));
        }
            return String.valueOf(word.charAt(word.length() / 2));
    }

    public static void main(String[] args) {
        String word = "testing";
        System.out.println(getMiddle(word));
    }
}
