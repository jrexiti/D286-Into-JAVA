package com.example;

import java.util.Scanner;

public class assessment08 {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        double[] values = new double[3];

        for (int i = 0; i < values.length; i++) {
            values[i] = scnr.nextDouble();
        }

        double sum = 0;

        for (double value : values) {
            sum += value;
        }
        double average = sum / values.length;

        System.out.print("Array items: ");
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i]);
            if (i < values.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Average: " + average);
        scnr.close();

    }
}
