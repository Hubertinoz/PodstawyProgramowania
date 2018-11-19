package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Exercise EX = new Exercise();

        System.out.println(EX.validPhoneNumber("(123) 45-7890"));
        System.out.println(EX.createPhoneNumber(new int[]{1,2,3,4,5,6,7,8,9,0}));
        System.out.println(EX.makeComplement("ATTGC"));
        System.out.println(EX.arithmetic(3,4,"add"));
        System.out.println(EX.isIsogram("thumbscrewjapingly"));
        System.out.println(EX.getMiddle("test"));
        System.out.println(EX.GetSum(-1,3));
        System.out.println(EX.seriesSum(4));
        System.out.println();
    }
}
