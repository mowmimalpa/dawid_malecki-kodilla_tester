package com.kodilla.abstracts.homework;



public class Person {
    public static void main(String[] args) {

      int ageDriver = 32;
      int ageButcher = 34;
      String Rzeznik = "Rzeźnik";
      String Driver = "Kierowca";
      String driverFirstName = "Andrzej";
      String butcherFirstName = "Piotr";
      Job job = new Butcher();
      Job job1 = new Driver();




        PersonProcessor processor = new PersonProcessor();
        processor.process(job);
        System.out.println(butcherFirstName+":lat:"+ageButcher+":"+Rzeznik+"\n");
        processor.process(job1);
        System.out.println(driverFirstName+":lat:"+ageDriver+":"+Driver+"\n");













    }

}