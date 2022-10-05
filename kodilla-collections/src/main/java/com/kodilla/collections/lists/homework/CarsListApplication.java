package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Renault;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Ford(10,2.5,1));
        cars.add(new Ford(15,2.6,2));
        cars.add(new Opel(20,2.7,3));
        cars.add(new Opel(25,2.8,4));
        cars.add(new Renault(30,2.9,5));
        cars.add(new Renault(35,3.0,6));


        for(Car car : cars) {
            CarUtils.describeCar(car);
        }

        cars.remove(3);
        System.out.println("Po usunięciu pozycji 4:");
        for(Car car : cars) {
            CarUtils.describeCar(car);
        }
        System.out.println("Rozmiar kolekcji: " + cars.size());

        cars.remove(new Opel(20,2.7,3));
        System.out.println("Po usunięciu obiektu:");
        for(Car car : cars) {
            CarUtils.describeCar(car);
        }
        System.out.println(" ");
        System.out.println("Rozmiar kolekcji:" + cars.size());
    }
}