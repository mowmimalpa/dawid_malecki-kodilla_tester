package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Ford implements Car{

    int speed;
    private int acceleration;
    private int brakes;

    public Ford(int speed, int acceleration, int brakes) {
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

        speed=acceleration;
    }

    public void decreaseSpeed() {

        speed=brakes;
    }







    @Override
    public String toString() {
        return "Ford" + " "+ "predkosc=" + " "+  speed + ", przyspiesznie=" + acceleration + ", hamowanie=" + brakes
                ;
    }


}


