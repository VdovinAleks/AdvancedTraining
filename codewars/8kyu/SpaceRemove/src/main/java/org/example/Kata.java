package org.example;

public class Kata {
    public static String noSpace(final String x) {
        return x.replace(" ","");
    }

    public static void main(String[] args) {
        String txt = "8 j 8   mBliB8g  imjB8B8  jl  B";
        System.out.println(noSpace(txt));

    }
}
