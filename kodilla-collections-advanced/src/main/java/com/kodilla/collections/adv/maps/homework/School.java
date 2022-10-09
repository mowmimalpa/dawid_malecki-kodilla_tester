package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;
    private List<Integer> students;

    public School(String schoolName, int... students) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();

        for (int number : students) {
            this.students.add(number);
        }
    }

    public int getSum() {
        int sum = 0;
        for (int number : students) {
            sum += number;
        }
        return sum;
    }

    public String getSchoolName() {
        return schoolName;
    }
}