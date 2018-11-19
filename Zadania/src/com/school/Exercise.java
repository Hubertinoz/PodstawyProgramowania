package com.school;

public class Exercise {
    public static void main(String[] args) {

        //zad1 Wypisanie tablicy

        int[] ex1 = {5,3,7,9,6,8,2,4};
        for (int i = 0; i < ex1.length; i++) {
            System.out.print(ex1[i]);
        }

        System.out.println();

        //zad2 Wypisanie tablicy od tylu

        int[] ex2 = {5,3,7,9,6,8,2,4};
        for (int i = ex2.length-1; i >= 0; i--) {
            System.out.print(ex2[i]);
        }

        System.out.println();

        //zad3 Znaleźć największy element w tablicy

        int result = 0;
        int[] ex3 = {5,3,7,9,6,8,2,4};

        for (int i = 0; i < ex3.length; i++) {
            if(ex3[i]> result)
                result = ex3[i];

        }
        System.out.println(result);

        //zad4 Posortować tablice

        int temp;
        int[] ex4 = {5,3,7,9,6,8,2,4};
        for (int x = 0; x < ex4.length-1; x++) {
            if (ex4[x] > ex4[x + 1]) {
                temp = ex4[x + 1];
                ex4[x + 1] = ex4[x];
                ex4[x] = temp;
                x = 0;
            }

        }

        for (int y = 0; y < ex4.length; y++) {
            System.out.print(ex4[y]);
        }

        System.out.println();

        //zad5 Wpisać do tablicy 0 - liczba jest parzysta
        // 1-jeżeli jest nieparzysta

        int[] ex5 = {5,3,7,9,6,8,2,4};
        for (int i = 0; i <= ex5.length - 1; i++) {
            if (ex5[i]%2== 0)
                ex5[i] = 1;
            else
                ex5[i] = 0;
            }

        for (int i = 0; i <= ex5.length-1; i++) {
            System.out.print(ex5[i]);
        }

        System.out.println();

       //zad6 Zwrocic wartosc unikatowa

        int[] unikat = {1, 2, 3, 4, 6, 1, 5, 3, 5, 2};

        for (int i = 0; i < unikat.length; i++) {
            boolean uniq = true;
            for (int j = 0; j < unikat.length; j++) {
                if (i != j) {
                    if (unikat[i] == unikat[j]) {
                        uniq = false;
                    }
                }
            }
            if (uniq) {
                System.out.println("Unikat: " + unikat[i]);
            }
        }

        //zad7 Wyswietlenie tablicy od tylu co 2

        int[] ex7 = {5,3,7,9,6,8,2,4};
        for (int i = ex7.length-1; i >= 0; i=i-2) {
            System.out.print(ex7[i]);
        }

        //zad8 Liczenie sredniej z tablicy

        int resu = 0;
        int[] tab = {1,2,6};

        for (int i = 0; i < tab.length; i++) {
            resu += tab[i];
        }

        System.out.println(resu / tab.length);
    }
}
