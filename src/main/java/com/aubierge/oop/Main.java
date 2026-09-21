package com.aubierge.oop;

import com.aubierge.oop.model.Community;
import com.aubierge.oop.model.CommunityMember;
import com.aubierge.oop.model.MemberStatus;
import com.aubierge.oop.model.Student;
import com.aubierge.oop.model.Teacher;
import com.aubierge.oop.model.Volunteer;

public class Main {

    public static void main(String[] args) {

        Community community = new Community();

        CommunityMember student = new Student(
                "Flora",
                17,
                "STU001"
        );

        CommunityMember teacher = new Teacher(
                "Mr. Eric",
                35,
                "Java"
        );

        community.addMember(student);
        community.addMember(teacher);

        student.setStatus(MemberStatus.ACTIVE);

        Volunteer studentVolunteer = new Student(
                "Aubierge",
                16,
                "STU002"
        );

        Volunteer teacherVolunteer = new Teacher(
                "Mrs. Alice",
                32,
                "Mathematics"
        );

        studentVolunteer.volunteer();
        teacherVolunteer.volunteer();

        System.out.println();

        community.displayMembers();

        System.out.println();

        System.out.println(
                "Total members: " + community.getMemberCount()
        );
    }
}