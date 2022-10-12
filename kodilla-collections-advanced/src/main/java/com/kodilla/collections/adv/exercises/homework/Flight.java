package com.kodilla.collections.adv.exercises.homework;

import java.util.Objects;

public class Flight {
    public String departure;
    public String arrival;

    public Flight(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getDeparture() {

        return departure;
    }

    public String getArrival() {

        return arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return getDeparture().equals(flight.getDeparture()) &&
                getArrival().equals(flight.getArrival());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getDeparture(), getArrival());
    }

    @Override
    public String toString() {

        return "Z: " + departure + "do: " + arrival;
    }
}