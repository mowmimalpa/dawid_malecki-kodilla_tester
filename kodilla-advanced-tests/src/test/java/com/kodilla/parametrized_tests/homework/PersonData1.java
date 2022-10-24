package com.kodilla.parametrized_tests.homework;



import org.junit.jupiter.params.provider.Arguments;


import java.util.stream.Stream;

public class PersonData1 {
    static Stream<Arguments> provideDataForPerson() {
        return java.util.stream.Stream.of(
                Arguments.of(new Person(1.54, 82), "Obese Class I (Moderately obese)"),
                Arguments.of(new Person(1.72, 42), "Very severely underweight"),
                Arguments.of(new Person(1.61, 92), "Obese Class II (Severely obese)"),
                Arguments.of(new Person(1.62, 61), "Normal (healthy weight)"),
                Arguments.of(new Person(1.80, 132), "Obese Class III (Very severely obese)"),
                Arguments.of(new Person(1.33, 44), "Normal (healthy weight)"),
                Arguments.of(new Person(1.72, 55), "Normal (healthy weight)"),
                Arguments.of(new Person(1.92, 88), "Normal (healthy weight)")

        );

    }
}