package com.example;

import java.util.Scanner;

public class assessment04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read full name
        String fullName = scanner.nextLine();

        // Read age
        String age = scanner.nextLine();

        // Read salary
        String salary = scanner.nextLine();

        // Print the formatted message
        System.out.println(fullName + " is " + age + " and makes $" + salary + ".");

        scanner.close();
    }
}
