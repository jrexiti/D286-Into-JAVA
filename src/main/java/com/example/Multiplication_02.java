package com.example;

import java.util.Scanner;

public class Multiplication_02 {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        int starting_num = scnr.nextInt();
        int multiplier = scnr.nextInt();

        int result = starting_num * multiplier;

        System.out.print(result + " ");

        result = result * multiplier;
        System.out.print(result + " ");

        result = result * multiplier;

        System.out.println(result);

        scnr.close();
    }

}
