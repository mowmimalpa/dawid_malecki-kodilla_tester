package com.kodilla.abstracts.homework;

import com.kodilla.abstracts.homework.Job;

public class Driver extends Job {
    int ageDriver = 32;
   // int ageButcher = 34;
   // String Rzeznik = "Rzeźnik";
    //String Driver = "Kierowca";
    String driverFirstName = "Andrzej";
   // String butcherFirstName = "Piotr";
    //Job job = new Butcher();
    //Job job1 = new Driver();

    public Driver(){
        super(3333,"Kieruje pojazdem");
    }

    @Override
    public void test(){
        System.out.println("wiek"+ageDriver+":Imię:"+driverFirstName+":"+" "+showResponsibilities());
    }
}