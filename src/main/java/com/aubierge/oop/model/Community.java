package com.aubierge.oop.model;

import java.util.ArrayList;
import java.util.List;

public class Community {

    private final List<CommunityMember> members;

    public Community() {
        members = new ArrayList<>();
    }

    public void addMember(CommunityMember member) {
        if (member == null) {
            throw new IllegalArgumentException("Member cannot be null.");
        }

        members.add(member);
    }

    public int getMemberCount() {
        return members.size();
    }

    public List<CommunityMember> getMembers() {
        return new ArrayList<>(members);
    }

    public List<CommunityMember> findMembersByStatus(MemberStatus status) {
        if (status == null) {
            throw new IllegalArgumentException("Status cannot be null.");
        }

        List<CommunityMember> matchingMembers = new ArrayList<>();

        for (CommunityMember member : members) {
            if (member.getStatus() == status) {
                matchingMembers.add(member);
            }
        }

        return matchingMembers;
    }

    public void displayMembers() {
        System.out.println("Community Members:");

        for (CommunityMember member : members) {
            member.displayMemberType();
        }
    }
}