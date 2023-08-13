package com.example;

import java.util.Scanner;

public class assessment06 {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        String fullName = scnr.nextLine();
        String splitName[] = fullName.split(" ");

        String output = splitName[splitName.length - 1].charAt(0) + "., " + splitName[0];
        if (splitName.length > 2) {

            output += " " + splitName[1].charAt(0) + ".";

        }
        System.out.println(output);
        scnr.close();
    }
}
