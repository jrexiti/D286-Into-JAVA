package com.example;

public class Pet_12 {

    private String name;
    private String type;
    private int age;

    public Pet_12() {
        name = "unknown";
        type = "unknown";
        age = 0;
    }

    public Pet_12(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

}
