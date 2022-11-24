package com.kodilla.parametrized_tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringValidatorTest {

    private StringValidator validator = new StringValidator();

    @Test
    public void shouldReturnFalseIfStringIsNotEmpty() {
        assertFalse(validator.isBlank("test"));
    }

    @Test
    public void shouldReturnTrueIfStringIsEmpty() {
        assertTrue(validator.isBlank(""));
    }

    @Test
    public void shouldReturnTrueIfStringHasOnlySpaces() {
        assertTrue(validator.isBlank("   "));
    }

    @Test
    public void shouldReturnTrueIfStringIsNull() {
        assertTrue(validator.isBlank(null));
    }
    @ParameterizedTest
    @NullSource
    public void shouldReturnTrueIfStringIsNull(String text) {
        assertTrue(validator.isBlank(text));
    }
}


