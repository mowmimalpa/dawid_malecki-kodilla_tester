package com.kodilla.collections.interfaces.homework;

public class Ford implements Car{

    double speed;
    private double acceleration;
    private double brakes;

    public Ford(double speed, double acceleration, double brakes) {
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
        return "Ford" + " "+ "predkosc=" + " "+  speed + ", przyspiesznie=" + acceleration + ", hamowanie=" + brakes
                ;
    }


}


