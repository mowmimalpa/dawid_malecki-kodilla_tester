package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }


    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.subtract(a, b);
        assertEquals(-3, sumResult);


    }

    @Test
    public void testSquare() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int square = a * a;
        assertEquals(0, square);

    }

    @Test
    public void testSquare1() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int square = a * a;
        assertEquals(-1, square);
    }

    @Test
    public void testSquare2() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int square = a * a;
        assertEquals(25, square);
    }

    @Test
    void testDelta() {
        Calculator calculator = new Calculator();
        double expected = 23.0;
        double actual = 250.0;
        double delta = 0.0;
        assertEquals(expected, actual, delta);
//test
    }
}
