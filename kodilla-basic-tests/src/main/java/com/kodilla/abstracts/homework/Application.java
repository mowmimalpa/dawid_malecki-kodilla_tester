package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {
    Shape quadrate = new Quadrate(2,4);

    Processor processor = new Processor();
    processor.process(quadrate);

}
}