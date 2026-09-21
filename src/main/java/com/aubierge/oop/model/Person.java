package com.aubierge.oop.model;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }

        this.age = age;
    }

    public void introduce() {
        System.out.println(
                "Hello, my name is " + name +
                " and I am " + age + " years old."
        );
    }
}