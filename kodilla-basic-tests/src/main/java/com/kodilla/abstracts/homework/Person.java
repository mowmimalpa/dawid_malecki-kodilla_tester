package com.kodilla.abstracts.homework;

public class Person {
    public static void main(String[] args) {

      int driverAge = 32;
      int ButcherAge =34;
      String Rzeznik = "Rzeźnik";
      String Driver = "Kierowca";
      String driverName = "Andrzej";
      String butcherName = "Piotr";







        Driver myDriver = new Driver(2222,"Kreci kierownicą");

        Butcher myButcher = new Butcher(3333,"Kroi");
     myDriver.test();


        myButcher.test();


        PersonProcessor processor = new PersonProcessor();
        processor.process(myDriver);
        System.out.println(Driver+ ":"+driverName);

        processor.process(myButcher);
        System.out.println(Rzeznik+":"+butcherName);




    }

}