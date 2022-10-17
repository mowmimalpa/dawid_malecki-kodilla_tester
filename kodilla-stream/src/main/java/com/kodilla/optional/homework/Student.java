package com.kodilla.optional.homework;

import java.util.Objects;

public class Student {
    private String name;
    private Teacher teacher;

    public Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return getName().equals(student.getName()) && getTeacher().equals(student.getTeacher());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getTeacher());
    }

    public String getName(){
        return name;

    }
    public Teacher getTeacher(){
        return teacher;
    }


}
