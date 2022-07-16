package com.hillel.suraieva.homework10;

import java.util.Arrays;

public class Lottery {
    public static void main(String[] args) {
        int kolNumbers = 7;
        int[] winNumbers = new int[kolNumbers];
        int[] playerNumbers = new int[kolNumbers];
        int kolMatched = 0;
        for (int i = 0; i < kolNumbers; i++) {
            winNumbers[i] = (int) (Math.random()*10);
            playerNumbers[i] = (int) (Math.random()*10);
        }
        Arrays.sort(winNumbers);
        Arrays.sort(playerNumbers);

        System.out.println("Win numbers:    " + Arrays.toString(winNumbers));
        System.out.println("Player numbers: " + Arrays.toString(playerNumbers));


        for (int i = 0; i < kolNumbers; i++) {
            if (winNumbers[i] == playerNumbers[i]) {
                kolMatched++;
            }
            }
        System.out.println("Number of matches: "+ kolMatched);
        }

    }

