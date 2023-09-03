package org.example;

public class KeepHydrated {
    public static int Liters(Double time){
        return (int) (time * 0.5);
    }

    public static void main(String[] args) {
        System.out.println(Liters(6.7));
    }
}
