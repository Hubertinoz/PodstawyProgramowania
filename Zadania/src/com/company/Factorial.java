package com.company;

import java.util.Scanner;

public class Factorial {

    public static void main() {

        System.out.print("Calculate factorial from the number: ");
        Scanner key = new Scanner(System.in);
        int nmb = key.nextInt();

        int ratio = 1;

        for (int i=1; i<=nmb; i++) {
            ratio *= i;
        }
        System.out.println(ratio);
    }
}
