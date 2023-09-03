package org.example;

public class Kata {


    public static String binaryAddition(int a, int b){
        return Integer.toBinaryString(a+b);
        //Тоже интересное решение.
//        int sum = a + b;
//        int bit;
//        String result = "";
//        while (sum != 0) {
//            bit = sum % 2;
//            result = bit + result;
//            sum = sum / 2;
//        }
//        return result;
    }


    public static void main(String[] args) {
        System.out.println(binaryAddition(5,9));

    }

}
