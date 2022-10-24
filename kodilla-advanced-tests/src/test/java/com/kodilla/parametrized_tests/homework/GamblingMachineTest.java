package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class GamblingMachineTest {

    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/numbersToFail.csv")
    public void shouldThrownExceptionWithIncorrectNumbers(String numbers){
        String [] expectedArray = numbers.split(",");
        Set<String> expectedSet = new HashSet<>(Arrays.asList(expectedArray));
        List<Integer>numbersToCheck = expectedSet
                .stream()
                .map(u -> Integer.parseInt(u))
                .collect(Collectors.toList());
        Set<Integer>expectedParse = new HashSet<>(numbersToCheck);
        Assertions.assertThrows(InvalidNumbersException.class,()-> gamblingMachine.validateNumbers(expectedParse));
    }


}
