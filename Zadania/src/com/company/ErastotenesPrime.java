package com.company;

import java.util.Scanner;

public class ErastotenesPrime {

    public static void main() {
        Scanner tekst = new Scanner(System.in);
        System.out.print("Type number: ");
        Integer liczba = tekst.nextInt();

        if (pierwsza(liczba))
            System.out.println("This is prime number");
        else
            System.out.println("This is not a prime number");

    }

    public static boolean pierwsza(int a) {
        if (a < 2) {
            return false;
        }

        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
