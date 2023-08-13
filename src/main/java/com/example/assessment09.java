package com.example;

import java.util.Random;
import java.util.Scanner;

public class assessment09 {

    public static String showResults(Random rand) {
        int randomValue = rand.nextInt(2);
        return randomValue == 1 ? "true" : "false";
    }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        int times = scnr.nextInt();
        Random rand = new Random(2);

        for (int i = 0; i < times; i++) {
            System.out.println(showResults(rand));
        }

        scnr.close();
    }
}
