package com.kodilla.collections.interfaces.homework;

public class Opel implements Car{

    int speed;
    private int acceleration;
    private int brakes;

    public Opel(int speed, int acceleration, int brakes) {
        this.speed = speed;
        this.acceleration = acceleration;
        this.brakes = brakes;
    }
    public int getSpeed() {

        return speed;
    }

    public int getAcceleration() {
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


