package com.company;

import java.util.Scanner;

public class ThreeNumbers {
    public static void main() {

        Scanner tekst = new Scanner(System.in);
        System.out.println("Type first number:");
        Integer a = tekst.nextInt();
        System.out.println("Type second number:");
        Integer b = tekst.nextInt();
        System.out.println("Type third number:");
        Integer c = tekst.nextInt();

        System.out.println("Descend: ");
        if (b > a) {
            if (c > b)
                System.out.println(c + " " + " " + b + " " + a);
            else if (c > a)
                System.out.println(b + " " + " " + c + " " + a);
            else
                System.out.println(b + " " + " " + a + " " + c);
        } else  {
            if (c > a)
                System.out.println(c + " " + " " + a + " " + b);
            else{
                if(c>b)
                    System.out.println(a + " " + " " + c + " " + b);
                else
                    System.out.println(a + " " + " " + b + " " + c);
            }

        }

        System.out.println("Ascend:");
        if (b > a) {
            if (c > b)
                System.out.println(a + " " + " " + b + " " + c);
            else if (c > a)
                System.out.println(a + " " + " " + c + " " + b);
            else
                System.out.println(c + " " + " " + a + " " + b);
        } else  {
            if (c > a)
                System.out.println(b + " " + " " + a + " " + c);
            else{
                if(c>b)
                    System.out.println(b + " " + " " + c + " " + a);
                else
                    System.out.println(c + " " + " " + b + " " + a);
            }

        }
    }
}
