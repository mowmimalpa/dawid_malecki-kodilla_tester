package com.kodilla.collections.adv.exercises.homework.testsuite;

import com.kodilla.collections.adv.exercises.homework.Flight;
import com.kodilla.collections.adv.exercises.homework.FlightFinder;
import com.kodilla.collections.adv.exercises.homework.FlightRepository;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {


    ///Given -  tworzy sekcję w której tworzymy założenia początkowe.
    // Ustawiamy stan systemu (zwany również stanem świata) na potrzebny do testów.
    //When - w tej sekcji wykonujemy akcję którą chcemy testować.
    //Then  -  wykonujemy sprawdzenia czy aplikacja zachowała się zgodnie z oczekiwaniami.





    /// Testy mogą być w takiej formie? Czy give-when-then jest wskazaną praktyką?
    @Test
    public void doesAddTheRightFlights() {
        //when
        FlightRepository.getFlightsTable();
        //then
        List<Flight> expectedFlights = new ArrayList<>();
      expectedFlights.add(new Flight("Warszawa", "Monako"));
      expectedFlights.add(new Flight("Londyn", "Rzym"));
      expectedFlights.add(new Flight("Londyn", "Babimost"));
      expectedFlights.add(new Flight("Katowice","Wroclaw"));
        assertEquals(expectedFlights, FlightRepository.getFlightsTable());
    }

    @Test
    public void doesFindDepartures() {
        //when
        List <Flight> result = FlightFinder.findFlightsFrom("Londyn");
        //then
        List<Flight> expectedFlights = new ArrayList<>();
        expectedFlights.add(new Flight("London", "Rzym"));
        assertEquals(expectedFlights, FlightFinder.findFlightsFrom("Londyn"));
    }

    @Test
    public void doesFindArrivals() {
        //when
        List <Flight> result = FlightFinder.findFlightsTo("Monako");
        //then
        List<Flight> expectedFlights = new ArrayList<>();
        expectedFlights.add(new Flight("Warszawa", "Monako"));
        assertEquals(expectedFlights, FlightFinder.findFlightsTo("Monako"));
    }

    @Test
    public void doesFailToReturnIfNothingFound() {
        //when
        List <Flight> resultDep = FlightFinder.findFlightsFrom("Sosnowiec");
        List <Flight> resultArr = FlightFinder.findFlightsTo("Sosnowiec");
        //then
        List<Flight> expectedFlights = new ArrayList<>();
        assertEquals(expectedFlights, resultDep);
        assertEquals(expectedFlights, resultArr);
    }
}