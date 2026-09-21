package com.aubierge.oop.model;

public class Teacher extends Person {

    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void teach() {
        System.out.println(
                getName() + " is teaching " + subject + "."
        );
    }
}