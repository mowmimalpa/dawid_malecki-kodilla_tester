package com.kodilla.collections.adv.exercises.homework;


import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    static List<Flight> flightsTable;



    public static List<Flight> getFlightsTable() {
        flightsTable = new ArrayList<>();
        flightsTable.add(new Flight("Warszawa", "Monako"));
        flightsTable.add(new Flight("Londyn", "Rzym"));
        flightsTable.add(new Flight("Londyn", "Babimost"));
        flightsTable.add(new Flight("Katowice","Wroclaw"));
        return flightsTable;
    }
}



