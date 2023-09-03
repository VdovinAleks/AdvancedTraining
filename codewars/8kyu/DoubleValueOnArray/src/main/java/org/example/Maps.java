package org.example;

import java.util.Arrays;

public class Maps {
    public static int[] map (int[] arr){
        int [] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray [i] = arr[i] * 2;
        }
        return newArray;
    }

    public static void main(String[] args) {
        int [] arr = {2,5,3,4};
        System.out.println(Arrays.toString(map(arr)));
    }
}
