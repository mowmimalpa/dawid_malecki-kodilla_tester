package com.kodilla.collections.arrays.homework;


import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Renault;

import java.util.Random;

public class CarApplication {

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15)+5];
        for (int n = 0; n < cars.length; n++) {
            cars[n] = drawCar();
            cars[n].increaseSpeed();
        }
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    static Car drawCar() {
        Random random = new Random();
        int drawnCarKind = random.nextInt(5);
        double a = random.nextDouble() * 21 + 8;
        double b = random.nextDouble() * 34 + 5;
        double c = random.nextDouble() * 22 + 4;

        if (drawnCarKind == 0) { //a,b,c
            return new Ford(10,20,30);
        }
        else if (drawnCarKind == 1) {
            return new Opel(30,20,10);
        }
        else {
            return new Renault(20,10,30);
        }
    }



}