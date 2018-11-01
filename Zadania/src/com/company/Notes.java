package com.company;

import java.util.Scanner;

public class Notes {
    public static void main() {
        Scanner tekst = new Scanner(System.in);
        System.out.print("Notes for distance:");
        double a = tekst.nextInt() * 0.2;
        System.out.print("Notes for style:");
        double b = tekst.nextInt() * 0.3;
        System.out.print("Notes for landing:");
        double c = tekst.nextInt() * 0.5;

        System.out.println("Final result: " + (a + b + c));

    }
}
