package com.aubierge.oop;

import com.aubierge.oop.model.Community;
import com.aubierge.oop.model.CommunityMember;
import com.aubierge.oop.model.MemberStatus;
import com.aubierge.oop.model.Student;
import com.aubierge.oop.model.Teacher;
import com.aubierge.oop.model.Volunteer;
import java.util.List;
import com.aubierge.oop.service.MemberRegistrationService;

public static void main(String[] args) {

    Community community = new Community();

    MemberRegistrationService registrationService =
            new MemberRegistrationService(community);

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

    CommunityMember secondStudent = new Student(
            "Aubierge",
            16,
            "STU002"
    );

    registrationService.registerMember(student);
    registrationService.registerMember(teacher);
    registrationService.registerMember(secondStudent);

    student.setStatus(MemberStatus.ACTIVE);
    teacher.setStatus(MemberStatus.ACTIVE);
    secondStudent.setStatus(MemberStatus.GRADUATED);

    Volunteer studentVolunteer = new Student(
            "Claire",
            17,
            "STU003"
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

    System.out.println();

    List<CommunityMember> graduatedMembers =
            community.findMembersByStatus(MemberStatus.GRADUATED);

    System.out.println("Graduated Members:");

    for (CommunityMember member : graduatedMembers) {
        member.displayMemberType();
    }
}