package com.kodilla.abstracts.homework;

public class Processor {

    public void process(Shape shape) {
        System.out.println("Powierzchnia:" + shape.calculateSurface());
        System.out.println("Obwód:" + shape.calculateCircuit());
        shape.calculateCircuit();
        shape.calculateSurface();

    }
}