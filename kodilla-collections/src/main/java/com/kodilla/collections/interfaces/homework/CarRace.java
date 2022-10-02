package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {

        Ford ford = new Ford(0,45,2);
        doRace(ford);

        Opel opel = new Opel(0,30,3);
        doRace(opel);

        Renault renault = new Renault(0,25,4);
        doRace(renault);

    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.decreaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();

        System.out.println(car.getSpeed()+" "+ "Samochod"+ " "+car.toString());

    }
}