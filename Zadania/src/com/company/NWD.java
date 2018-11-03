package com.company;

public class NWD {
    public static void main() {
        int a = 5;
        int b = 6;

        while (a != b)
        {
            if(a>b)
                a= a-b;
            else
                b= b-a;
        }
        System.out.println(a);

    }
}
