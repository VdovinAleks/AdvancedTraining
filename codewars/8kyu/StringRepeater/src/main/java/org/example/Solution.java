package org.example;

public class Solution {
    public static String repeatString(final int repeat,final String s){
        return s.repeat(repeat);
    }

    public static void main(String[] args) {
        System.out.println(repeatString(3,"W"));
    }
}
