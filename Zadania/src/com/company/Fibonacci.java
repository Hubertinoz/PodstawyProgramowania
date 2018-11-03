package com.company;

public class Fibonacci {

    public static void main() {
        int a = 0;
        int b = 1;
        int result = 0;

        for (int i = 1; i < 10; i++) {
            result = a + b;
            a = b;
            b = result;
            System.out.println(result);
        }

    }

}
