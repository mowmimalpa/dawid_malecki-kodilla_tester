package com.kodilla.abstracts.homework;

import com.kodilla.abstracts.homework.Job;

public class Driver extends Job {
    public Driver(int salary,String responsibilities){
        super(3333,"Kieruje pojazdem");
    }

    @Override
    public void test(){
        System.out.println();
    }
}