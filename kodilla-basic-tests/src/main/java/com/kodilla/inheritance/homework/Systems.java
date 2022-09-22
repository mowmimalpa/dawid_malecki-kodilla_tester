package com.kodilla.inheritance.homework;

public class Systems {

    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2011,8,21);
        operatingSystem.turnOn();

        Spec spec = new Spec(2012,9,20);
        spec.displayProduct();

    }
}