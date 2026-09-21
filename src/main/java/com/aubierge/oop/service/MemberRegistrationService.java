package com.aubierge.oop.service;

import com.aubierge.oop.model.Community;
import com.aubierge.oop.model.CommunityMember;

public class MemberRegistrationService {

    private final Community community;

    public MemberRegistrationService(Community community) {
        if (community == null) {
            throw new IllegalArgumentException("Community cannot be null.");
        }

        this.community = community;
    }

    public void registerMember(CommunityMember member) {
        if (member == null) {
            throw new IllegalArgumentException("Member cannot be null.");
        }

        community.addMember(member);

        System.out.println(
                member.getName() + " has been registered successfully."
        );
    }

    public Community getCommunity() {
        return community;
    }
}