package org.example;

import java.util.Arrays;

public class Kata {

    public static String expandedForm(int num)
    {
        String outs = "";
        for (int i = 10; i < num; i *= 10) {
            System.out.println("i = 10; i < num; i *= 10 -> " + i);
            System.out.println("rem = " + num +" % "+ i);
            int rem = num % i;
            System.out.println("if rem > 0 do -> + " + rem +" + "+ outs + " : " + outs);
            outs = (rem > 0) ? " + " + rem + outs : outs;
            System.out.println(num + " -= " + rem + "\n");
            num -= rem;
        }
        outs = num + outs;

        return outs;
    }



    public static void main(String[] args) {
        int a = 43250;
        System.out.println(expandedForm(a));

    }
}
