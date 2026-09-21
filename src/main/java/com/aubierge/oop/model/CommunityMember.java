package com.aubierge.oop.model;

public abstract class CommunityMember extends Person {

    public CommunityMember(String name, int age) {
        super(name, age);
    }

    public abstract void performRole();

    public void displayMemberType() {
        System.out.println("Community member: " + getName());
    }
}