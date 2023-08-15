package com.example;

import java.util.Scanner;

public class PetInfo_12 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String name, type;
        int age;

        Pet_12 pet1 = new Pet_12();

        name = scnr.next();
        type = scnr.next();
        age = scnr.nextInt();
        Pet_12 pet2 = new Pet_12(name, type, age);

        name = scnr.next();
        type = scnr.next();
        age = scnr.nextInt();
        Pet_12 pet3 = new Pet_12(name, type, age);

        System.out.println("Name: " + pet1.getName());
        System.out.println("Type: " + pet1.getType());
        System.out.println("Age: " + pet1.getAge() + "\n");

        System.out.println("Name: " + pet2.getName());
        System.out.println("Type: " + pet2.getType());
        System.out.println("Age: " + pet2.getAge() + "\n");

        System.out.println("Name: " + pet3.getName());
        System.out.println("Type: " + pet3.getType());
        System.out.println("Age: " + pet3.getAge()); // should this end with a ne line?

        scnr.close();
    }

}
