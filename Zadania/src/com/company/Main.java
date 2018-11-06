package com.company;

import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Select Language / Wybierz jezyk: ");
        System.out.println("English Type 1 / Polski Wpisz 2: ");
        Scanner key = new Scanner(System.in);
        int lang = key.nextInt();

        if(lang == 2)
        {
            System.out.println("## Wpisz numer zadania aby uruchomic ##");
            System.out.println("1.Dodawanie liczb od 1 do 1,000,000");
            System.out.println("2.Czy mozna stworzyc trojkat z podanych bokow?");
            System.out.println("3.Znajdz te liczby od 1 do 100 ktore spelniaja a*a+b*b=c*c");
            System.out.println("4.Kalkulator czasu");
            System.out.println("5.Chinczyk");
            System.out.println("6.Tabliczka mnozenia");
            System.out.println("7.Noty za skoki");
            System.out.println("8.Liczby pierwsze");
            System.out.println("9.Trzy liczby");
            System.out.println("10.Zgadnij liczbe");
            System.out.println("11.Zamiana dwoch liczb");
            System.out.println("12.Ciag Fibonacci'ego");
            System.out.println("13.Silnia");
            System.out.println("14.Zdanie od tylu");
            System.out.println("15.Najwiekszy wspolny dzielnik (NWD)");
            System.out.println("16.Potegowanie");
            System.out.println("17.Kalkulator");
            System.out.println("18.Sortowanie babelkowe");
            System.out.println("19.Najwieksza i najmniejsza liczba tablicy");
            System.out.println("20.Konwerter binarne/dziesietne i dziesietne/binarne");
            System.out.println("21.Algorytm Luhna Sprawdzajacy poprawnosc karty");
            System.out.print("Twoj wybor: ");
        }
        else if(lang == 1) {
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
            System.out.println("15.Greatest common divisor");
            System.out.println("16.Pow");
            System.out.println("17.Calculator");
            System.out.println("18.Bubble sort");
            System.out.println("19.Largest & Smallest number of table");
            System.out.println("20.Converter binary/decimal i decimal/binary");
            System.out.println("21.Luhna Algorithm");
            System.out.print("Your choice: ");
        }

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
                ErastotenesPrime.main();
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
                EuklidesNWD.main();
                break;
            case 16:
                Pow.main();
                break;
            case 17:
                Calculator.main();
                break;
            case 18:
                BubbleSort.main();
                break;
            case 19:
                TableFind.main();
                break;
            case 20:
                Converter cnv = new Converter();
                cnv.main();
                break;
            case 21:
                Luhna.main();
                break;
            default:
                System.out.println("Wrong number :/");
                break;
        }
    }
}
