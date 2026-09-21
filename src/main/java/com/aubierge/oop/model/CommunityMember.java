package com.aubierge.oop.model;

public abstract class CommunityMember extends Person {

    private MemberStatus status;

    public CommunityMember(String name, int age) {
        super(name, age);
        this.status = MemberStatus.ACTIVE;
    }

    public MemberStatus getStatus() {
        return status;
    }

    public void setStatus(MemberStatus status) {
        if (status == null) {
            throw new IllegalArgumentException("Status cannot be null.");
        }

        this.status = status;
    }

    public abstract void performRole();

    public void displayMemberType() {
        System.out.println(
                "Community member: " + getName()
                        + " | Status: " + status
        );
    }
}