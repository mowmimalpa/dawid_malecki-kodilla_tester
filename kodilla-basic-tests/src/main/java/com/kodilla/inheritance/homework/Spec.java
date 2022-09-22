package com.kodilla.inheritance.homework;

import com.kodilla.inheritance.homework.Car;

public class Spec extends OperatingSystem {

    public Spec(int year,int ram,int version) {
        super(year,version,ram);
        System.out.println("System operation production:");

    }

    public void getRam() {
        System.out.println("Ram:");
    }

    public void getVersion() {
        System.out.println("Version:");
    }

    @Override
    public void getYear() {
        System.out.println("Year:");
    }



}