package com.company;

import java.util.Random;
import java.util.Scanner;

public class FindNumber {
    public static void main() {

        Random rnd = new Random();
        int x = rnd.nextInt(10)+1;
        Scanner scn = new Scanner(System.in);

        for (int i = 1; i < 6 ; i++) {
            System.out.print("Type number 1-10: ");
            int y = scn.nextInt();
            if(y==x) {
                System.out.println("Correct, this number is " + x);
                break;
            }
            else if (y>x)
                System.out.println("This number is smaller, you have " + (5-i) + " chances");
            else if (y<x)
                System.out.println("This number is smaller, you have " + (5-i) + " chances");
            if (i==5)
                System.out.println("You lose!");

        }





    }
}
