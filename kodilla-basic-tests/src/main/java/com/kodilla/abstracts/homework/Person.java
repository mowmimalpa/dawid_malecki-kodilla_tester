package com.kodilla.abstracts.homework;


import com.kodilla.abstracts.AnimalProcessor;

public class Person {
    public static void main(String[] args) {
        Butcher butcher = new Butcher();
        butcher.test();
        Driver driver = new Driver();
        driver.test();

        PersonProcessor processor = new PersonProcessor();
        processor.process(butcher);

        



    }
}
