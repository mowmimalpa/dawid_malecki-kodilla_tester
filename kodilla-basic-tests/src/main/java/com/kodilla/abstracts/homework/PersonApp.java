package com.kodilla.abstracts.homework;


public class PersonApp {


    public static void main(String[] args) {
        Person myPerson = new Person("Andrzej",22,new Driver());
        Person myPerson1 = new Person ("Piotr",23,new Butcher());

        myPerson.showResponsibilities();
        myPerson1.showResponsibilities();



        }


    }










