package com.example;

import java.util.Scanner;

public class SmallestSum_07 {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        int sum = 0;

        int smallest = Integer.MAX_VALUE;

        int value;

        while (true) {
            value = scnr.nextInt();
            if (value < 0) {
                break;
            }

            sum += value;

            if (value < smallest) {
                smallest = value;
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Sum: " + sum);

    }
}
