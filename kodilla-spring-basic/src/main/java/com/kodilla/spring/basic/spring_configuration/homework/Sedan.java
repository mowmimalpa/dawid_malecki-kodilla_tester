package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Sedan implements Car{
    @Override
    public boolean lightsTurnOn(){
        if(LocalTime.now().isAfter(LocalTime.of(20,00)) || (LocalTime.now().isBefore(LocalTime.of(6,00)))) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String getCarType(){
        return "Sedan";
    }
}
