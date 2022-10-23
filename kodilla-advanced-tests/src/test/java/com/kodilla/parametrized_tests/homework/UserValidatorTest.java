package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

public class UserValidatorTest {
    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @EmptySource
    public void shouldReturnFalseWhenUserIsEmpty(String username) {
        Assertions.assertFalse(validator.validateUsername(username));

    }
    @ParameterizedTest
    @ValueSource(strings = {"asd,,,&", "BX`#"})
    public void shouldReturnFalseWHenUserHasProhibitedSigns(String username) {
        Assertions.assertFalse(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"x", "as"})
    public void shouldReturnFalseWhenUserIsBelowThanThreeChars(String username) {
        Assertions.assertFalse(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"asdfg","klopsik2"})
    public void shouldReturnTrueWhenUserHasMoreThanThreeChars(String username) {
        Assertions.assertTrue(validator.validateUsername(username));
    }


    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseWhenEmailIsNull(String email) {
        Assertions.assertFalse(validator.validateEmail(email));
    }
    @ParameterizedTest
    @EmptySource
    public void shouldReturnTrueWhenEmailIsEmpty (String email) {
        Assertions.assertTrue(validator.validateEmail(email));
}
    @ParameterizedTest
    @ValueSource (strings = {"nezuk9o@gmail.@.com","polk.2@.*.interia.pl"})
    public void shouldRetrunFalseWhenEmailHasProhibitedSigns(String email){
        Assertions.assertFalse(validator.validateEmail(email));
    }
    @ParameterizedTest
    @ValueSource(strings ={"asdfgh90@gmail.com","qweRt_212@nor-bud.pl"})
    public void shouldReturnTrueWhenEmailHasCorrectSigns(String email){
        Assertions.assertTrue(validator.validateEmail(email));
    }



}
//^[-a-z0-9~!$%^&*_=+}{\'?]+(\.[-a-z0-9~!$%^&*_=+}
// {\'?]+)*@([a-z0-9_][-a-z0-9_]*(\.[-a-z0-9_]+)*\.
// (aero|arpa|biz|com|coop|edu|gov|info|int|mil|museum|name|
// net|org|pro|travel|mobi|[a-z][a-z])|([0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.
// [0-9]{1,3}))(:[0-9]{1,5})?$



