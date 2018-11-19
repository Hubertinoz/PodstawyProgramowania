package com.company;

public class Exercise {

    //    Write a function that accepts a string, and returns true if it is in the form of a phone number.
    //    Assume that any integer from 0-9 in any of the spots will produce a valid phone number.
    //    Only worry about the following format:
    //    (123) 456-7890 (don't forget the space after the close parentheses)

    public static boolean validPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("^\\(\\d{3}\\)\\s\\d{3}\\-\\d{4}$");
    }

    //    Write a function that accepts an array of 10 integers (between 0 and 9), that returns
    //    a string of those numbers in the form of a phone number.

    public static String createPhoneNumber(int[] numbers) {
        String result = "";
        String first,second,third;

        first = Integer.toString(numbers[0])+ Integer.toString(numbers[1])+ Integer.toString(numbers[2]);
        second = Integer.toString(numbers[3])+ Integer.toString(numbers[4])+ Integer.toString(numbers[5]);
        third = Integer.toString(numbers[6])+ Integer.toString(numbers[7])+ Integer.toString(numbers[8]) + Integer.toString(numbers[9]);
        result = "(" + first + ") " + second + "-" + third;
        return result;
    }

    //    Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries
    //    the "instructions" for the development and functioning of living organisms.
    //    If you want to know more http://en.wikipedia.org/wiki/DNA
    //    In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G".
    //    You have function with one side of the DNA (string, except for Haskell);
    //    you need to get the other complementary side. DNA strand is never empty or there
    //    is no DNA at all (again, except for Haskell).

    public static String makeComplement(String dna) {
        String result = "";
        for(int i=0; i < dna.length(); i++){
            if(dna.charAt(i)=='A'){
                result = result+"T";
            } else if(dna.charAt(i)=='T'){
                result = result+"A";
            } else if(dna.charAt(i)=='G'){
                result = result+"C";
            } else if(dna.charAt(i)=='C'){
                result = result+"G";
            }
        }
        return result;
    }

    //    Given two numbers and an arithmetic operator (the name of it, as a string),
    //    return the result of the two numbers having that operator used on them.
    //    a and b will both be positive integers, and a will always be the first number in the operation,
    //    and b always the second. The four operators are "add", "subtract", "divide", "multiply".

    public static int arithmetic(int a, int b, String operator) {
        int result = 0;
        switch(operator)
        {
            case "add":
                result = a+b;
                return result;
            case "subtract":
                result = a-b;
                return result;
            case "multiply":
                result = a*b;
                return result;
            case "divide":
                result = a/b;
                return result;
        }
        return 0;
    }

    //    An isogram is a word that has no repeating letters, consecutive or non-consecutive.
    //    Implement a function that determines whether a string that contains only letters is an isogram.
    //    Assume the empty string is an isogram. Ignore letter case.

    public static boolean  isIsogram(String str) {

        if(str == "")
            return true;

        String first = "";
        String second = "";

        for(int i=0; i<str.length()-1;i++)
        {
            first = Character.toString(str.charAt(i));

            for(int x=0; x<str.length();x++)
            {
                second = Character.toString(str.charAt(x));


                if(first.equalsIgnoreCase(second) && i!=x)
                {
                    return false;
                }
            }
        }
        return true;
    }

    //    You are going to be given a word. Your job is to return the middle character of the word.
    //    If the word's length is odd, return the middle character. If the word's length is even, return the middle 2 characters.

    public static String getMiddle(String word) {
        char a, b;
        String result = "";

        if ((word.length()-1) % 2 == 0) {
            a = word.charAt(word.length() / 2);
            result  = Character.toString(a);
        } else {
            a = word.charAt((word.length() / 2)-1);
            b = word.charAt((word.length() / 2));
            result = Character.toString(a) + Character.toString(b);
        }
        return result;
    }

    //    Given two integers a and b, which can be positive or negative, find the sum of all the numbers
    //    between including them too and return it. If the two numbers are equal return a or b.
    //    Note: a and b are not ordered!

    public static int GetSum(int a, int b)
    {
        int result = 0;
        int min = 0;
        int max = 0;

        if (a>b)
        {
            min = b;
            max = a;
        } else {
            min = a;
            max = b;
        }

        for(int i = min; i<=max; i++)
        {
            result = result + i;
        }

        return result;
    }

    //    Your task is to write a function which returns the sum of following series upto nth term(parameter).
    //    Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...
    //    Rules: You need to round the answer to 2 decimal places and return it as String.
    //    If the given value is 0 then it should return 0.00
    //    You will only be given Natural Numbers as arguments.

    public static String seriesSum(int n) {
        float result = 1.0f;
        float baseNum = 1.0f;
        if (n <= 0) result = 0;
        else {
            for (int i = 1; i < n; i++) {
                baseNum = baseNum + 3;
                result += 1.0 / baseNum;
            }
        }
        return String.format("%.2f", result);
    }
}
