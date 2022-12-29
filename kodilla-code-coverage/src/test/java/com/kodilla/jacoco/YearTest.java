package com.kodilla.jacoco;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;

 class YearTest {

     @Test
     void shouldBeLeapYearIfDivisibleBy400() {

         //given
         Year year = new Year(1600);

         //when
         boolean yearIsLeap = year.isLeap();

         //then
         assertTrue(yearIsLeap);
     }

     @Test
     void shouldBeLeapIfDividedBy4() {

         //given
         Year year = new Year(2024);

         //when
         boolean yearIsLeap = year.isLeap();

         //then
         assertTrue(yearIsLeap);
     }

     @Test
     void shouldntBeLeapIfNotDividedBy4() {

         //given
         Year year = new Year(1777);

         //when
         boolean isLeapYear = year.isLeap();

         //then
         Assertions.assertFalse(isLeapYear);

     }
 }