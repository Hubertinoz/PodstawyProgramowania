package com.company;

import java.util.Scanner;

public class ex4 {
    public static void main() {
        int changes;
        Scanner scn = new Scanner(System.in);

        System.out.print("Type hour:");
        int hour = scn.nextInt();
        System.out.print("Type minutes:");
        int minutes = scn.nextInt();
        System.out.print("How much minutes do you want add?");
        int timeadd = scn.nextInt();

        changes = hour * 60 + minutes + timeadd;
        hour = changes / 60;
        minutes = changes % 60;

        System.out.print("After a complicated calculation, we have time: ");

        if (hour < 10 && minutes > 10)
            System.out.print("0" + hour + ":" + minutes);
        else if (minutes < 10 && hour > 10)
            System.out.print(hour + ":" + "0" + minutes);
        else if (hour < 10 && minutes < 10)
            System.out.print("0" + hour + ":" + "0" + minutes);
        else
            System.out.print(hour + ":" + minutes);

    }
}
