package com.kodilla.collections.arrays.homework;


import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Renault;

import java.util.Random;

public class CarApplication {

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int n = 0; n < cars.length; n++) {
            cars[n] = drawCar();
            cars[n].increaseSpeed();
        }
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    private static Car drawCar() {
        Random random = new Random();
            int drawnCarKind = random.nextInt(15);
            //rand speed
        double start = 50;
        double end = 90;
            double a = random.nextDouble() * 15 + 1;

            //rand acceleration
            double b = random.nextDouble() * 15 + 1;
            //rand brakes
            double c = random.nextDouble() * 15 + 1;


            if (drawnCarKind == 0) {
                return new Ford(a, b, c);
            } else if (drawnCarKind == 1) {
                return new Opel(a, b, c);
            } else {
                return new Renault(a, b, c);
            }
        }




}

