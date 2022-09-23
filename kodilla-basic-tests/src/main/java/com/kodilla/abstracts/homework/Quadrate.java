package com.kodilla.abstracts.homework;

public class Quadrate extends Shape{ //dog
    double side1 =  2;
    double resultOfSurface = side1*side1;
    double resultofCircuit = 4*side1;

    public Quadrate(double surface,double circuit) {
        super(surface, circuit);

    }
    @Override
    public double calculateSurface() {
        return resultOfSurface;
    }
    @Override
    public double calculateCircuit(){
        return resultofCircuit;


    }
}
