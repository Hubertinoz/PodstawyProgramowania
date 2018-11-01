package com.company;

public class ex1 {

    public static void main() {
        long suma = 0;
        System.out.println("The sum of 1,000,000 numbers");
        for (int x = 1; x < 100000; x++) {
            suma+= x;
        }
        System.out.println(suma);
    }
}
