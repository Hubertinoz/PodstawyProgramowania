package com.company;

import java.util.Scanner;

public class Pow {
    public static void main() {
        Scanner tekst = new Scanner(System.in);

        System.out.print("Type first number: ");
        Integer podstawa = tekst.nextInt();
        System.out.print("Type second number: ");
        Integer wykladnik = tekst.nextInt();
        int result = 1;

        for (int i = 1; i <= wykladnik; i++) {
            result *= podstawa;

        }
        System.out.println(result);
    }
}
