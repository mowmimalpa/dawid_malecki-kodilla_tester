package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CarFactoryTestSuite {

    @Test
    public void shouldCheckWhenLightsTurnedOn(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("dependsOnTheSeason");
        boolean headlights = car.lightsTurnOn();
        Assertions.assertTrue(headlights);

    }

    @Test
    public void shouldChoosesCarForTheSeason(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("dependsOnTheSeason");
        String carType = car.getCarType();
        Assertions.assertEquals("Sedan",carType);
    }

}
