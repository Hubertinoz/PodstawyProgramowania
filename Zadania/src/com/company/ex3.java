package com.company;

public class ex3 {
    public static void main() {

        for (int q = 1; q < 100; q++) {
            for (int w = 1; w < 100; w++) {
                for (int e = 1; e < 100; e++) {
                    if ((q*q) + (w*w) == (e*e))
                        //System.out.println("Working " + q*q + " + " + w*w + " = " + e*e);
                        System.out.println("This number is " + q + " i " + w + " and " + e);
                }
            }
        }
    }
}
