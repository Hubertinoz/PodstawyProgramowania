package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Type number of exercise to run.");
        System.out.println("1.Add all numbers from 1 to 1,000,000");
        System.out.println("2.Is it possible to create triangle with given sides");
        System.out.println("3.Find that numbers from 1 to 100 which meet the condition a*a+b*b=c*c");
        System.out.println("4.Time Calculator");
        System.out.println("5.Ludo Game");
        System.out.println("6.Multiplication Table");
        System.out.println("7.x");
        System.out.println("8.x");
        System.out.println("9.x");

        Scanner key = new Scanner(System.in);
        int nmb = key.nextInt();

        switch (nmb) {
            case 1:
                ex1.main();
                break;
            case 2:
                ex2.main();
                break;
            case 3:
                ex3.main();
                break;
            case 4:
                ex4.main();
                break;
            case 5:
                ex5.main();
                break;
            case 6:
                MTable.main();
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
        }
    }
}
