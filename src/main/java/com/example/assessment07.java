package com.example;

import java.util.Scanner;

public class assessment07 {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        int sum = 0;
        int smallest = Integer.MAX_VALUE;
        boolean hasNonNegative = false;

        while (true) {
            int number = scnr.nextInt();
            if (number < 0) {
                break;
            }
            sum += number;
            if (number < smallest) {
                smallest = number;
            }
            hasNonNegative = true;

        }
        if (hasNonNegative) {
            System.out.println("Smallest number: " + smallest);
            System.out.println("Sum: " + sum);

        } else {
            System.out.println("No non-negative numbers were entered.");
        }
        scnr.close();
    }
}