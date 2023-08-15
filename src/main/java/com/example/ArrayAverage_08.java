package com.example;

import java.util.Scanner;

public class ArrayAverage_08 {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        double[] values = new double[3];
        double sum = 0;

        for (int i = 0; i < values.length; i++) {

            values[i] = scnr.nextDouble();

            sum += values[i];

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

    }
}
