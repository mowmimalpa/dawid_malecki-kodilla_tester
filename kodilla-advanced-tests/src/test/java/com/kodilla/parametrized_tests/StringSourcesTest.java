//package com.kodilla.parametrized_tests;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.MethodSource;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class StringSourcesTest {
//
//    @ParameterizedTest
//    @MethodSource(value = "com.kodilla.parametrized_tests.StringSources#provideStringsForTestingLength")
//    public void shouldCalculateStringLengthWithoutSpaces(String input, int expected) {
//        assertEquals(expected, manipulator.getStringLengthWithoutSpaces(input));
//    }
//}