package com.kodilla.abstracts.homework;

import com.kodilla.abstracts.homework.Job;

public class Driver extends Job {
    public Driver(String name,int salary,int age,String job,String responsibilities){
        super(name,salary,age,job,responsibilities);
    }

    @Override
    public void test(){
        System.out.println();
    }
}