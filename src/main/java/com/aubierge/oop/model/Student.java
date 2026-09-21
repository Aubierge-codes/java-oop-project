package com.aubierge.oop.model;

public class Student extends Person {

    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void study() {
        System.out.println(getName() + " is studying.");
    }
}