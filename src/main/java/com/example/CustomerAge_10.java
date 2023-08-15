package com.example;

import java.util.Scanner;

public class CustomerAge_10 {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        Customer_10 customer1 = new Customer_10();
        Customer_10 customer2 = new Customer_10();

        String name1, name2;
        int age1, age2;

        name1 = scnr.nextLine();
        age1 = scnr.nextInt();

        customer1.setName(name1);
        customer1.setAge(age1);

        scnr.nextLine();

        name2 = scnr.nextLine();
        age2 = scnr.nextInt();

        customer2.setName(name2);
        customer2.setAge(age2);

        System.out.println("Customer that is older:");

        if (customer1.getAge() > customer2.getAge()) {
            customer1.printInfo();
        } else {
            customer2.printInfo();
        }

    }

}
