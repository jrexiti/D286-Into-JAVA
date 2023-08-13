package com.example;

import java.util.Scanner;

public class assessment10 {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        assessment10Customer customer1 = new assessment10Customer();
        assessment10Customer customer2 = new assessment10Customer();

        String name1, name2;
        int age1, age2;

        name1 = scnr.next();
        age1 = scnr.nextInt();

        customer1.setName(name1);
        customer1.setAge(age1);

        name2 = scnr.next();
        age2 = scnr.nextInt();

        customer2.setName(name2);
        customer2.setAge(age2);

        System.out.println("Customer that is older:");

        if (customer1.getAge() > customer2.getAge()) {
            customer1.printInfo();
        } else {
            customer2.printInfo();
        }
        scnr.close();
    }

}
