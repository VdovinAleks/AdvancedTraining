package org.example;

import java.util.Arrays;

public class Solution {
    public static String accum(String s) {
        // your code
        String result = "";
        String[] arr = s.toLowerCase().split("");
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                result = arr[i].toUpperCase() + "-";
            } else if ( i+1 < arr.length) {
                result = result + arr[i].toUpperCase() + arr[i].repeat(i) + "-";
            }
            else {
                result = result+ arr[i].toUpperCase() + arr[i].repeat(i);
            }
        }
        return result;
    }


    public static void main(String[] args) {
        String s = "QOWka";
        System.out.println(accum(s));
    }
}
