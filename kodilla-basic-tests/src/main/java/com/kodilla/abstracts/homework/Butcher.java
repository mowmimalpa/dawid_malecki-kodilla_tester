package com.kodilla.abstracts.homework;

import com.kodilla.abstracts.homework.Job;

public class Butcher extends Job {
    public Butcher(int salary,String responsibilities){
        super(2222,"Kroi mięso");
    }


    @Override
    public void test(){
        System.out.println();
    }
}