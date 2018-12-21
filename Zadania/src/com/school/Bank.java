package com.school;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        double kasa = 3405;
        String haslo = "1234";
        Boolean opcja = true;
        Scanner scn = new Scanner(System.in);
        System.out.println("Witaj w banku podaj pin: ");
        String pin = scn.next();

        if (haslo.equals(pin)) {
            System.out.println("Pin poprawny, wpisz co chcesz zrobic:");
            while (opcja) {
                System.out.println("==========================");
                System.out.println("[1] Stan konta");
                System.out.println("[2] Wplac");
                System.out.println("[3] Wyplac");
                System.out.println("[4] Wyjdz");
                System.out.println("==========================");
                int wybor = scn.nextInt();
                switch (wybor) {
                    case 1:
                        System.out.println("Twoj stan konta: " + kasa + " zl");
                        break;
                    case 2:
                        System.out.println("Podaj kwote do wplaty:");
                        float kwotawplaty = scn.nextInt();
                        kasa = kasa + kwotawplaty;
                        System.out.println("Wplacono " + kwotawplaty + " na konto");
                        break;
                    case 3:
                        System.out.println("Podaj kwote do wyplaty:");
                        float kwotawyplaty = scn.nextInt();
                        if (kwotawyplaty > kasa)
                            System.out.println("Nie masz tyle srodkow na koncie");
                        else {
                            kasa = kasa - kwotawyplaty;
                            System.out.println("Wyplacono " + kwotawyplaty + " z konta");
                        }
                        break;
                    case 4:
                        System.out.println("Dziekujemy za skorzystanie z uslug naszego banku. Do widzenia.");
                        opcja = false;
                        break;
                    default:
                        System.out.println("Zla opcja");
                        continue;
                }
            }
        } else
            System.out.println("Zly pin, do widzenia");
    }
}
