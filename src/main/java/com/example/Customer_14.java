package com.example;

import java.util.ArrayList;

public class Customer_14 {
    private int id;
    private String name;

    private ArrayList<Grocery_14> groceryList;

    public Customer_14() {
    groceryList = new ArrayList<>();
    }

    public ArrayList<Grocery_14> getGroceryList() {
        return groceryList;
    }

    public void addGrocery(Grocery_14 grocery) {
        groceryList.add(grocery);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
