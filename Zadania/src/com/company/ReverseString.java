package com.company;

public class ReverseString {
    public static void main() {
        String ala = "Expression";
        char change;

        for (int i = ala.length() - 1; i >= 0; i--) {
            change = ala.charAt(i);
            System.out.print(change);
        }

    }
}
