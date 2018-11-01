package com.company;

import java.util.Random;

public class Ludo {
    public static void main() {

        Random rnd = new Random();
        int playerA = 1;
        int playerB = 1;

        while (playerA < 1000 && playerB < 1000) {
            playerA += rnd.nextInt(6);
            System.out.println("Player A move to: " + playerA);

            if (playerB == playerA) {
                playerB = 1;
                System.out.println("Player A killed player B");
            }

            playerB += rnd.nextInt(6);
            System.out.println("Player B move to: " + playerB);

            if (playerA == playerB) {
                playerA = 1;
                System.out.println("Player B killed player A");
            }
        }
        if (playerA >= 1000)
            System.out.println("Player A win");
        else
            System.out.println("Player B win");


    }
}
