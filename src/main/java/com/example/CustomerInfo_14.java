package com.example;

import java.util.Scanner;

public class CustomerInfo_14 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String name, item;
        double price, total = 0;
        int quantity;

        Grocery_14 grocery = null;
        Customer_14 customer1 = new Customer_14();
        name = scnr.next();

        String sentinel = "y";

        do {

            item = scnr.next();
            price = scnr.nextDouble();
            quantity = scnr.nextInt();

            grocery = new Grocery_14(item, price, quantity);
            customer1.addGrocery(grocery);

            sentinel = scnr.next();

        } while (sentinel.equals("y"));

        System.out.println(name + " has the following items:\n");

        for (Grocery_14 g : customer1.getGroceryList()) {
            System.out.println("Item: " + g.getItem());
            System.out.println("Price: " + g.getPrice());
            System.out.println("Quantity: " + g.getQuantity() + "\n");
            total += g.getPrice();
        }

        System.out.println("Total: " + total);
    }
}
