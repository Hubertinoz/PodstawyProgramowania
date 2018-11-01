package com.company;

import java.util.Scanner;

public class MakeTriangle {
    public static void main() {

        Scanner key = new Scanner(System.in);
        System.out.print("Type side A:");
        int a = key.nextInt();
        System.out.print("Type side B:");
        int b = key.nextInt();
        System.out.print("Type side C:");
        int c = key.nextInt();

        if (a+b>c && a+c>b && b+c>a)
            System.out.println("Yeaah! We can create a triangle");
        else
            System.out.println("Ops we can't create a triangle");
    }
}
