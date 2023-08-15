package com.example;

import java.util.Scanner;

public class DivisibleBy_05 {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        int a = scnr.nextInt();
        int b = scnr.nextInt();
        int c = scnr.nextInt();

        // Check if any of the integers are negative
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid input!");
        } else {
            int number = a * 100 + b * 10 + c;
            int sum = a + b + c;

            // Check if the sum of the digits is divisible by 3 and print the result
            if (sum % 3 == 0) {
                System.out.println(number + " is divisible by 3!");
            } else {
                System.out.println(number + " is not divisible by 3!");
            }
        }

        scnr.close();
    }
}
