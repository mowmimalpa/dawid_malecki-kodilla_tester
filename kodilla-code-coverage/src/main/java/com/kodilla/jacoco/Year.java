package com.kodilla.jacoco;

public class Year {
    int yearIsLeap;

    public Year(int year) {
        this.yearIsLeap = year;
    }

    public boolean isLeap() {
        return this.yearIsLeap % 4 == 0 && this.yearIsLeap % 100 != 0 || this.yearIsLeap % 400 == 0;
    }
}