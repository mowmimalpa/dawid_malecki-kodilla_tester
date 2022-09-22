package com.kodilla.inheritance.homework;

public class System {

    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2011,8,21);
        operatingSystem.turnOn();

        Spec spec = new Spec(2018,10,16);
        spec.displayProduct();

    }
}