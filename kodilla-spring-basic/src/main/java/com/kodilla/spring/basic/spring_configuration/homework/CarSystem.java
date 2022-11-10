package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.MonthDay;

@Configuration
public class CarSystem {


    @Bean
    public Car dependsOnTheSeason() {
        Car car;
        if ((MonthDay.now().isAfter(MonthDay.of(3, 20))
                && MonthDay.now().isBefore(MonthDay.of(6, 20)))
                || (MonthDay.now().isAfter(MonthDay.of(8, 20))
                && MonthDay.now().isBefore(MonthDay.of(12, 20)))) {
            car = new Sedan();
        } else if (MonthDay.now().isAfter(MonthDay.of(12, 20))
                && MonthDay.now().isBefore(MonthDay.of(3, 20))) {
            car = new SUV();
        } else {
            car = new Cabrio();
        }
        return car;
    }
}
