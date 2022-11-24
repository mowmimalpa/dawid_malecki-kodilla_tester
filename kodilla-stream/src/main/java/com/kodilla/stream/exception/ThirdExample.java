package com.kodilla.stream.exception;

public class ThirdExample {
    public static void main(String[] args) {
        AirportRepository airportRepository = new AirportRepository();
        try {
            boolean isViennaInUse = false;

            isViennaInUse = airportRepository.isAirportInUse("Vienna");
            System.out.println("Vienna status:" + isViennaInUse);
        } catch (AirportNotFoundException e) {
        } finally {

            System.out.println("Thank you for using Kodilla Airlines");
        }
    }
}
