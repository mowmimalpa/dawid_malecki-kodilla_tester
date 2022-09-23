package com.kodilla.abstracts.homework;

public class Person {
    public static void main(String[] args) {
        Driver myDriver = new Driver("Andrzej",2222,23,"Kierowca","Kręci kierownicą");
        Butcher myButcher = new Butcher("Piotr",3333,21,"Rzeźnik","Kroi kurczaki");
     myDriver.test();
        myButcher.test();
    }

}