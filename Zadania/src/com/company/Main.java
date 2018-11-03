package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("## Type number of exercise to run ##");
        System.out.println("1.Add all numbers from 1 to 1,000,000");
        System.out.println("2.Is it possible to create triangle with given sides");
        System.out.println("3.Find that numbers from 1 to 100 which meet the condition a*a+b*b=c*c");
        System.out.println("4.Time Calculator");
        System.out.println("5.Ludo Game");
        System.out.println("6.Multiplication Table");
        System.out.println("7.Notes");
        System.out.println("8.Prime Number");
        System.out.println("9.Three Numbers");
        System.out.println("10.Find the number");
        System.out.println("11.Change Int");
        System.out.println("12.Fibonacci");
        System.out.println("13.Factorial");
        System.out.println("14.Reverse string");
        System.out.println("15.NWD");
        System.out.println("16.Pow");

        System.out.print("Your choice: ");
        Scanner key = new Scanner(System.in);
        int nmb = key.nextInt();

        switch (nmb) {
            case 1:
                SumMilion.main();
                break;
            case 2:
                MakeTriangle.main();
                break;
            case 3:
                MeetCondition.main();
                break;
            case 4:
                TimeCalculator.main();
                break;
            case 5:
                Ludo.main();
                break;
            case 6:
                MultiplicationTable.main();
                break;
            case 7:
                Notes.main();
                break;
            case 8:
                PrimeNumber.main();
                break;
            case 9:
                ThreeNumbers.main();
                break;
            case 10:
                FindNumber.main();
                break;
            case 11:
                ChangeInt.main();
                break;
            case 12:
                Fibonacci.main();
                break;
            case 13:
                Factorial.main();
                break;
            case 14:
                ReverseString.main();
                break;
            case 15:
                NWD.main();
                break;
            case 16:
                Potegowanie.main();
                break;
            default:
                System.out.println("Wrong number :/");
                break;
        }
    }
}
