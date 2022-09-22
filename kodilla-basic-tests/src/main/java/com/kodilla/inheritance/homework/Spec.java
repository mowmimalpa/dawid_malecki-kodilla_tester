package com.kodilla.inheritance.homework;

public class Spec extends OperatingSystem {

    public Spec(int year,int ram,int version) {
        super(year,version,ram);
        System.out.println("System operation production:"+ year);

    }
    @Override
    public void turnOn() {
        System.out.println("TurnOn:");
    }

    public void turnOff() {
        System.out.println("Turn Off:");
    }





}