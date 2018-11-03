package com.company;

import java.util.Scanner;

public class Silnia {

    public static void main() {

        System.out.print("Oblicz silnie z liczby: ");
        Scanner key = new Scanner(System.in);
        int nmb = key.nextInt();

        int iloczyn = 1;

        for (int i=1; i<=nmb; i++) {
            iloczyn *= i;
        }
        System.out.println(iloczyn);
    }
}
