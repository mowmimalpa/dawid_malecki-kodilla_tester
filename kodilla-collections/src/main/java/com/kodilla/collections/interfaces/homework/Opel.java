package com.kodilla.collections.interfaces.homework;

public class Opel implements Car{

    double speed;
    private double acceleration;
    private double brakes;

    public Opel(double speed, double acceleration, double brakes) {
        this.speed = speed;
        this.acceleration = acceleration;
        this.brakes = brakes;
    }
    public double getSpeed() {

        return speed;
    }

    public double getAcceleration() {
        return acceleration;
    }
    public void increaseSpeed() {

        speed=acceleration++*2;
    }

    public void decreaseSpeed() {

        speed -= acceleration;
    }






    @Override
    public String toString() {
        return "Opel" +" "+ "predkosc=" + speed + ", przyspieszenie=" + acceleration + ", hamowanie=" + brakes
                ;
    }
}


