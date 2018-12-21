package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //zad1
        Random rnd = new Random();
        int liczba = rnd.nextInt(100);
        if(liczba%7==0)
            System.out.println("Liczba " + liczba +" Jest podzielna przez 6");
        else
            System.out.println("Liczba " + liczba +" nie jest podzielna przez 6");

        //zad2

        int[] tablica = {8,1,1,10,10,10,10,8,7,6,8};
        int szukanaliczba = 10;
        int wynik = 0;
        for (int i = 0; i < tablica.length-1; i++) {
            if(tablica[i] == szukanaliczba)
                wynik+=1;
        }
        System.out.println(wynik);

        //zad3
        int wielkosc = 6;

        for (int j=0; j<(wielkosc-1); j++) {
            System.out.print(" ");
        }
        System.out.println("*");

        for (int j=1; j<(wielkosc-1); j++)
        {
            for (int k=0;k<(wielkosc-1-j); k++) {
                System.out.print(" ");
            }
            System.out.print("*");

            for (int k=0;k<(j*2)-1; k++) {
                System.out.print(" ");
            }

            System.out.println("*");
        }

        for (int j=0; j<(wielkosc*2-1); j++)
            System.out.print("*");
        System.out.println("");

    }
}
