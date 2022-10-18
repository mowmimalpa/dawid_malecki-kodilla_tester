package com.kodilla.optional.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    @Test


    public void ShouldNewStudentsListHasTheSameSize() {

        //given
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Tony Hawk", new Teacher("Johnny Bravo")));
        studentList.add(new Student("Nikodem Dyzma", null));
        studentList.add(new Student("Filip Noga", new Teacher("Piotr Nowak")));

        //when
        List<Student> newList = (Application.showStudentsWithTeachersList(studentList));

        // then
        Assertions.assertEquals(studentList.size(), newList.size());
    }

    @Test
    public void ShouldThereAreTeacherNoNull() {

        // given
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Tony Hawk", new Teacher("Johnny Bravo")));
        studentList.add(new Student("Nikodem Dyzma", null));
        studentList.add(new Student("Filip Noga", new Teacher("Piotr Nowak")));

        // when
        List<Student> newList = (Application.showStudentsWithTeachersList(studentList));

        // then
        for (Student s : newList) {
            Assertions.assertNotNull(s.getTeacher(), s.getName());

        }
    }

        @Test
        public void ShouldTeacherHasNullCanBeConverted(){

            // given

            List<Student> studentList = new ArrayList<>();
            studentList.add(new Student("Nikodem Dyzma", null));
            studentList.add(new Student("Filip Noga", new Teacher(null)));
            String expectedTeacher = "<undefined>";


            // when
        List<Student> newList =(Application.showStudentsWithTeachersList(studentList));

        // then
            for (Student s : newList){
                Assertions.assertEquals(expectedTeacher,s.getTeacher().getName());
            }


    }



}