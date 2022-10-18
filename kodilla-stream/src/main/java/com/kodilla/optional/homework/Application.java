package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {


    private List<Student> students;

//     public Application() {
//
////         Optional <Student> student = students.stream().filter(student ->student.getTeacher().equals("Johnny Bravo"));
////
////         if (student.isPresent()){
////             System.out.println(student.get());
////         } else {
////             System.out.println("brak");
////
////         }
////
////
////
////     }


    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Tony Hawk", new Teacher("Johnny Bravo")));
        studentList.add(new Student("Nikodem Dyzma", null));
        studentList.add(new Student("Filip Noga", new Teacher("Piotr Nowak")));

    }
        public static void showStudentsWithTeachers(List<Student>students){
        for (Student student : students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            String teacherName = optionalTeacher.orElse(new Teacher("<undefined>")).getName();
            System.out.println("Student: " + student.getName() + " , teacher:" + teacherName);
        }
    }


    public static List<Student> showStudentsWithTeachersList(List<Student>students){
        List<Student> newStudentsList = new ArrayList<>();
        for(Student s: students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(s.getTeacher());
            String teacher = optionalTeacher.orElse(new Teacher("<undefined>")).getName();
            newStudentsList.add(new Student(s.getName(), new Teacher(teacher)));

        }
        return newStudentsList;


//                System.out.println(teacherName);
//            } else {
//            }
//            System.out.println("Brak nauczyciela");
        }





    }



