package com.company;

import java.util.Scanner;

public class Potegowanie {
    public static void main() {
        Scanner tekst = new Scanner(System.in);

        System.out.print("Type number: ");
        Integer podstawa = tekst.nextInt();
        System.out.print("Type number: ");
        Integer wykladnik = tekst.nextInt();
        int result = 1;

        for (int i = 1; i <= wykladnik; i++) {
            result *= podstawa;

        }
        System.out.println(result);
    }
}
