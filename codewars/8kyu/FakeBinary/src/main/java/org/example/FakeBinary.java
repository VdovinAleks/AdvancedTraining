package org.example;

public class FakeBinary {
    public static String fakebin(String numberString) {
       return numberString.replaceAll("[0-4]","0").replaceAll("[5-9]","1");
    }

    public static void main(String[] args) {

        System.out.println(fakebin("4538551245123512352345"));

    }
}
