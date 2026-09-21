package com.aubierge.oop;

import com.aubierge.oop.model.CommunityMember;
import com.aubierge.oop.model.Student;
import com.aubierge.oop.model.Teacher;
import com.aubierge.oop.model.Volunteer;

public class Main {

    public static void main(String[] args) {

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

        student.displayMemberType();
        student.introduce();
        student.performRole();

        System.out.println();

        teacher.displayMemberType();
        teacher.introduce();
        teacher.performRole();

        System.out.println();

        Volunteer studentVolunteer = (Volunteer) student;
        Volunteer teacherVolunteer = (Volunteer) teacher;

        studentVolunteer.volunteer();
        teacherVolunteer.volunteer();
    }
}