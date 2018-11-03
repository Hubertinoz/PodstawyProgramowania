package com.company;

public class ReverseString {
    public static void main() {
        String ala = "Ala ma kota";
        char zmiana;

        for (int i = ala.length() - 1; i >= 0; i--) {
            zmiana = ala.charAt(i);
            System.out.print(zmiana);
        }

    }
}
