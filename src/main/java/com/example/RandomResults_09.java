package com.example;

import java.util.Random;
import java.util.Scanner;

public class RandomResults_09 {

    public static String showResults(Random rand) {
        int randomValue = rand.nextInt(2);
        if (randomValue == 1) {
            return "true";
        } else {
            return "false";
        }
    }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        Random rand = new Random(2);

        int numOfTimes = scnr.nextInt();
        for (int i = 0; i < numOfTimes; i++) {
            System.out.println(showResults(rand));
        }

    }

}
