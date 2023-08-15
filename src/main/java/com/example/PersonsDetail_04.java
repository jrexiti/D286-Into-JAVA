package com.example;

import java.util.Scanner;

public class PersonsDetail_04 {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        String fullName = scnr.nextLine();
        int age = scnr.nextInt();
        String salary = scnr.next();

        System.out.println(fullName + " is " + age + " and makes $" + salary + ".");

        scnr.close();

    }
}
