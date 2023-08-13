package com.example;

import java.util.Scanner;

public class assessment02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int starting_num = scanner.nextInt();
        int multiplier = scanner.nextInt();
        int result = starting_num;

        for (int i = 0; i < 3; i++) {
            result *= multiplier;
            System.out.print(result);
            if (i < 2) { // Print a space after the first two numbers
                System.out.print(" ");
            }
        }

        System.out.println(); // Print a newline character at the end
        scanner.close();
    }

}
