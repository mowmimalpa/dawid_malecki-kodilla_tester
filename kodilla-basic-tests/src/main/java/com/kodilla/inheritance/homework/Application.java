package com.kodilla.inheritance.homework;

import com.kodilla.inheritance.homework.Car;
import com.kodilla.inheritance.homework.Convertible;

public class Application {

    public static void main(String[] args) {
        Car car = new Car(4, 5);
        car.turnOnLights();

        Convertible convertible = new Convertible(4, 2);
        convertible.turnOnLights();
        System.out.println(Spec.getYear());
    }
}