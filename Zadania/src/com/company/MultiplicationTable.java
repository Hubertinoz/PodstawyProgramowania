package com.company;

public class MultiplicationTable {
    public static void main() {

        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                System.out.print(" " + x * y + " ");
            }
            System.out.println("");

        }
    }
}