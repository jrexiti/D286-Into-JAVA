package com.example;

import java.util.Scanner;

public class assessment05 {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        /* Type your code here. */

        int firstNum = scnr.nextInt();
        int secondNum = scnr.nextInt();
        int thirdNum = scnr.nextInt();

        if (firstNum < 0 || secondNum < 0 || thirdNum < 0) {
            System.out.println("Invalid Input!");
        } else {
            int sum = firstNum + secondNum + thirdNum;
            if (sum % 3 == 0) {
                System.out.println(firstNum + "" + secondNum + "" + thirdNum + " is divisible by 3!");
            } else {
                System.out.println(firstNum + "" + secondNum + "" + thirdNum + " is not divisible by 3!");
            }
            System.out.println();
            scnr.close();

        }

    }

}
