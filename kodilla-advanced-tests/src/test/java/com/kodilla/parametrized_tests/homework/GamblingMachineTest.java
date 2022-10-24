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


    @ParameterizedTest
@CsvFileSource(resources = "/numbersToPass.csv")
public void ifNumberOfWinsIsCorrect(String strings) throws InvalidNumbersException {
        String[] numbers = strings.split("");
        Set<Integer> setNumbers = new HashSet<>();
        for (String number : numbers) {
            setNumbers.add(Integer.parseInt(number));
            int counted = gamblingMachine.howManyWins(setNumbers);
            boolean result = counted > 0 && counted < 6;
            Assertions.assertTrue(result);

        }
    }

        @ParameterizedTest
        @CsvFileSource(resources = "/numbersToFail.csv")
        public void shouldThrownExceptionWhenTheNumberOfUserIsOtherThanSix (String strings){
            String[] numbers = strings.split("");
            Set<Integer> userNumbers = new HashSet<>();
            for (String number : numbers) {
                userNumbers.add(Integer.parseInt(number));
                Assertions.assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumbers));

            }
        }
    }
