package com.company;

public class TableFind {
    public static void main() {
        int[] table = {5, 3, 4, 2, 44, 8, 9, 2, 7, 2, 6};
        int top = table[1];
        int last = table[1];

        for (int i = 0; i < table.length; i++) {
            if (table[i] > top)
                top = table[i];
            if (table[i] < last)
                last = table[i];
        }
        System.out.println("Highest table number: " + top + " and lowest: " + last);
    }
}
