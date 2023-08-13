package com.example;

public class assessment12 {

    private String name;
    private String type;
    private int age;

    public assessment12() {
        this.name = "unknown";
        this.type = "unknown";
        this.age = 0;
    }

    public assessment12(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public void setName(String petName) {
        name = petName;
    }

    public void setType(String petType) {
        type = petType;
    }

    public void setAge(int petAge) {
        age = petAge;
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

    public String toString() {
        return "Name: " + name + "\nType: " + type + "\nAge: " + age;
    }

}
