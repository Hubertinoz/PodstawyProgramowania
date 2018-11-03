package com.company;

import java.util.Random;
import java.util.Scanner;

public class FindNumber {
    public static void main() {

        Random rnd = new Random();
        int x = rnd.nextInt(10)+1;
        Scanner scn = new Scanner(System.in);

        for (int i = 1; i < 6 ; i++) {
            System.out.print("Podaj liczbe: ");
            int y = scn.nextInt();
            if(y==x) {
                System.out.println("Trafiles liczbe, ta liczba to " + x);
                break;
            }
            else if (y>x)
                System.out.println("Ta liczba jest mniejsza zostaly ci " + (5-i) + " szanse");
            else if (y<x)
                System.out.println("Ta liczba jest wieksza zostaly ci " + (5-i) + " szanse");
            if (i==5)
                System.out.println("Przegrales!");

        }





    }
}
