package com.company;

public class Palindrome {
    public static void main() {
        String word = "racecar";
        String reverse = "";

        for (int i = word.length()-1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        if (word.equalsIgnoreCase(reverse))
            System.out.println(word + " is a palindrome");
        else
            System.out.println(word + " is not a palindrome");
    }
}
