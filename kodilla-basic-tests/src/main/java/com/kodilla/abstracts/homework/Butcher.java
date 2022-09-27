package com.kodilla.abstracts.homework;

public class Butcher extends Job {

   // int ageDriver = 32;
    int ageButcher = 34;
    //String Rzeznik = "Rzeźnik";
   // String Driver = "Kierowca";
    //String driverFirstName = "Andrzej";
    String butcherFirstName = "Piotr";


   // Job job = new Butcher();
    //Job job1 = new Driver();
    public Butcher(){
        super(2222,"Kroi mięso");
    }



    @Override
    public void test(){
        System.out.println("wiek"+ageButcher+":Imię:"+butcherFirstName+":"+" "+showResponsibilities());
    }
}