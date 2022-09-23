package com.kodilla.abstracts.homework;

public abstract class Shape {
    private double surface;
    private double circuit;

    public Shape(double surface, double circuit){

    }
    public double getSurface(){return surface;}

    public double getCircuit(){return circuit;}




    public abstract double calculateSurface();


    public abstract double calculateCircuit();

}
