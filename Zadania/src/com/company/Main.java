package com.company;

public class Main {
    public static void main(String[] args) {

        //Zadanie 1
        long suma = 0;
        for (int x = 1; x < 100000; x++) {
            suma+= x;
        }
        System.out.println(suma);

        //Zadanie 2
        int a = 4;
        int b = 6;
        int c = 7;

        if (a+b>c && a+c>b && b+c>a)
            System.out.println("Da sie stworzyc trojkat");
        else
            System.out.println("Nie da sie stworzyc trojkata");

        //Zadanie 3
        for (int q = 1; q < 100; q++) {
            for (int w = 1; w < 100; w++) {
                for (int e = 1; e < 100; e++) {
                    if ((q*q) + (w*w) == (e*e))
                        //System.out.println("Dziala " + q*q + " + " + w*w + " = " + e*e);
                        System.out.println("Te liczby to " + q + " i " + w + " i " + e);
                }
            }
        }
//        int q = 3;
//        int w = 4;
//          int e = 5;
//        if (q*q + w*w == e*e)
//            System.out.println("Dziala " + q + " i " + w);
//        else
//            System.out.println("Nie dziala");


    }
}
