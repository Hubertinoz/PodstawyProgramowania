package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Podaj liczbe a: ");
        int a = scn.nextInt();
        System.out.print("Podaj znak: ");
        String c = scn.next();
        System.out.print("Podaj liczbe b: ");
        int b = scn.nextInt();

        switch(c){
            case "x":
                System.out.println(a+"x" + b +"=" +(a*b));
                break;
            case "/":
                System.out.println(a+"/" + b +"=" +(a/b));
                break;
            case "+":
                System.out.println(a+"+" + b +"=" +(a+b));
                break;
            case "-":
                System.out.println(a+"-" + b +"=" +(a-b));
                break;
            case "%":
                System.out.println(a+"%" + b +"=" +(a%b));
                break;
        }
    }

}
