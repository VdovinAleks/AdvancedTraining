package org.example;

public class Solution {
    public static String abbrevName(String name) {
        return String.valueOf(name.toUpperCase().split(" ")[0].charAt(0) + "." + name.toUpperCase().split(" ")[1].charAt(0));
    }

    public static void main(String[] args) {
        System.out.println(abbrevName("Sam harris"));
    }
}
