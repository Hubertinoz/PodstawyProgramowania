package com.company;

public class BubbleSort {
    public static void main() {
        int[] table = {1, 3, 4, 2, 5, 8, 9, 2, 7, 1, 6};
        int temp = 0;

        for (int i = 0; i < table.length - 1; i++) {
            if (table[i] > table[i + 1]) {
                temp = table[i + 1];
                table[i + 1] = table[i];
                table[i] = temp;
                i = 0;
            }

        }
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i]);
        }

    }
}
