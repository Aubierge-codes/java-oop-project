package com.aubierge.oop;

import com.aubierge.oop.model.Person;
import com.aubierge.oop.model.Student;
import com.aubierge.oop.model.Teacher;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Aubierge", 16);

        Student student = new Student(
                "Flora",
                17,
                "STU001"
        );

        Teacher teacher = new Teacher(
                "Mr. Eric",
                35,
                "Java"
        );

        person.introduce();

        student.introduce();
        student.study();

        teacher.introduce();
        teacher.teach();
    }
}