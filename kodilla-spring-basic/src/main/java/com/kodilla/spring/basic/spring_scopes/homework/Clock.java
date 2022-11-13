package com.kodilla.spring.basic.spring_scopes.homework;


import com.kodilla.spring.basic.dependency_injection.homework.Component;
import org.springframework.context.annotation.Scope;

import java.time.LocalTime;

@Component
@Scope("prototype")

public class Clock {
    public LocalTime getLocalTime(){ return LocalTime.now();}



}
