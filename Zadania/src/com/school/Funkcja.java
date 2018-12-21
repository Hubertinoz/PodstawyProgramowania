package com.school;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Funkcja {
    public static void main(String[] args) {
        //int[] table = {3,4,6,1,6,9};
        //pierwsza();
        //String imie ="Hubert";
        //System.out.println(druga(imie));
        //System.out.println(druga(imie,21));
        //tablica(table);
        System.out.println(silnia(4));
    }

    private static void pierwsza()
    {
        System.out.println("Nic nie zwraca");
    }

    private static String druga(String imie)
    {

        return "Hello" + imie;
    }

    private static String druga(String imie,int wiek)
    {

        return "Hello " + imie + " wiek " + wiek;
    }

    private static void tablica(int[] tab)
    {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]);
        }
    }

    private static int silnia(int nmb)
    {
        int result = 1;
        for (int i = 1; i <= nmb; i++) {
            result*=i;
        }

        return result;
    }
}
