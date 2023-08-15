package com.example;

import java.util.Scanner;

public class NameFormatter_06 {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        String fullName = scnr.nextLine();

        String[] nameParts = fullName.split(" ");

        char lastInitial = nameParts[nameParts.length - 1].charAt(0);

        System.out.print(lastInitial + "., " + nameParts[0]);

        if (nameParts.length == 3) {

            char middleInitial = nameParts[1].charAt(0);
            System.out.print(" " + middleInitial + ".");
        }

        System.out.println();

    }
}
