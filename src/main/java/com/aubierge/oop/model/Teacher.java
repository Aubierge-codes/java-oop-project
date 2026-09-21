package com.aubierge.oop.model;

public class Teacher extends CommunityMember implements Volunteer {

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

    @Override
    public void introduce() {
        System.out.println(
                "Hello, I am " + getName()
                        + ", a teacher of " + subject
                        + "."
        );
    }

    @Override
    public void performRole() {
        teach();
    }

    @Override
    public void volunteer() {
        System.out.println(
                getName() + " is mentoring the community."
        );
    }
}