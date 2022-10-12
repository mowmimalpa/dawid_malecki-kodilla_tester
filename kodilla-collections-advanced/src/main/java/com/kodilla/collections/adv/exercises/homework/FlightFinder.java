package com.kodilla.collections.adv.exercises.homework;


import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    public static List<Flight> findFlightsFrom(String searchedDeparture) {
        List <Flight> departureTable = new ArrayList<>();
        for(Flight flight : FlightRepository.getFlightsTable()) {
            if(flight.getDeparture().equals(searchedDeparture)) {
                departureTable.add(flight);
            }
        }
        if(departureTable.size() == 0) {
            System.out.println("Brak lotów z tego miejsca.");
        }
        return departureTable;
    }

    public static List<Flight> findFlightsTo(String searchedArrival) {
        List <Flight> arrivalTable = new ArrayList<>();
        for(Flight flight : FlightRepository.getFlightsTable()) {
            if(flight.getArrival().equals(searchedArrival)) {
                arrivalTable.add(flight);
            }
        }
        if(arrivalTable.size() == 0) {
            System.out.println("Loty z tego miejsca nie istnieją.");
        }
        return arrivalTable;
    }
}