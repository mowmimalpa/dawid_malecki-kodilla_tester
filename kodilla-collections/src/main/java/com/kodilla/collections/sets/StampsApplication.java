package com.kodilla.collections.sets;



import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {

        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Wieża Eiffla",3,2,false));
        stamps.add(new Stamp("JP2",5,4,true));
        stamps.add(new Stamp("Mieszko",3,2,true));
        stamps.add(new Stamp("Kazimierz Wielki",5,4,false));
        stamps.add(new Stamp("Gniezno",3,2,false));
        stamps.add(new Stamp("Kazimierz Wielki",5,4,true));
        stamps.add(new Stamp("Kazimierz Wielki",5,4,true));

        System.out.println("Rozmiar kolekcji: " + stamps.size());
        for(Stamp stamp: stamps) {
            System.out.println("Dodaj do kolekcji: " +stamp);
        }
    }
}
