package com.aubierge.oop.model;

public class Student extends CommunityMember implements Volunteer {

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

    @Override
    public void introduce() {
        System.out.println(
                "Hi, I am " + getName()
                        + ", a student with ID " + studentId
                        + "."
        );
    }

    @Override
    public void performRole() {
        study();
    }

    @Override
    public void volunteer() {
        System.out.println(
                getName() + " is volunteering in the community."
        );
    }
}