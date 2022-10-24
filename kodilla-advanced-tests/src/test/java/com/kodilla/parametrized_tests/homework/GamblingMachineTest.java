package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTest {

    GamblingMachine gamblingMachine = new GamblingMachine();

    //wyjatek
    @ParameterizedTest
    @CsvFileSource(resources = "/numbersToFail.csv")
    public void shouldThrownExceptionWithIncorrectNumbers(String numbers) {
        String[] expectedArray = numbers.split(",");
        Set<String> expectedSet = new HashSet<>(Arrays.asList(expectedArray));
        List<Integer> numbersToCheck = expectedSet
                .stream()
                .map(u -> Integer.parseInt(u))
                .collect(Collectors.toList());
        Set<Integer> expectedParse = new HashSet<>(numbersToCheck);
        Assertions.assertThrows(InvalidNumbersException.class, () -> gamblingMachine.validateNumbers(expectedParse));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/numbersToPass.csv")
    public void shouldNotCountWithIncorrectNumbers(String numbers) throws InvalidNumbersException {
        String[] expectedArray = numbers.split(",");
        Set<String> expectedSet = new HashSet<>(Arrays.asList(expectedArray));
        List<Integer> numbersToCheck = expectedSet
                .stream()
                .map(u -> Integer.parseInt(u))
                .collect(Collectors.toList());
        Set<Integer> expectedParse = new HashSet<>(numbersToCheck);
        Assertions.assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(expectedParse));

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/numbeersNotValid.csv")
    public void shouldPassWithCorrectNumbers(String numbers) throws InvalidNumbersException {
        String[] expectedArray = numbers.split(" ");
        Set<String> expectedSet = new HashSet<>(Arrays.asList(expectedArray));
        System.out.println(expectedSet);
        List<Integer> numbersToValidate = expectedSet
                .stream()
                .map(u -> Integer.parseInt(u))
                .collect(Collectors.toList());
        Set<Integer> expected = new HashSet<>(numbersToValidate);
        gamblingMachine.howManyWins(expected);
        assertEquals(6,expected.size());

    }
}