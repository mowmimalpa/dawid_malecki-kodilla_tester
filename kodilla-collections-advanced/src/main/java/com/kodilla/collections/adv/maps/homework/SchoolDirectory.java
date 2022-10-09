package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> allSchools = new HashMap<>();

        Principal adam = new Principal("Adam", "Żuczkowski");
        Principal piotr = new Principal("Piotr", "Adamczyk");
        Principal andrzej = new Principal("Andrzej", "Kowalski");

        School adamZszWolsztyn = new School("ZSZ Wolsztyn",10,20,30,40,50);
        School piotrLoWolsztyn = new School("LO Wolsztyn",20,25,156,185);
        School andrzejPowodowo = new School("ZSRiT Powodowo",35,65,85,123);

        allSchools.put(adam, adamZszWolsztyn);
        allSchools.put(piotr, piotrLoWolsztyn);
        allSchools.put(andrzej,andrzejPowodowo);

        for(Map.Entry<Principal, School> principalEntry : allSchools.entrySet()) {
            System.out.println("Dyrektor: " + principalEntry.getKey().getName() + " " + principalEntry.getKey().getSurname() + " szkoła " + principalEntry.getValue().getSchoolName() + " liczba uczniów: " +  principalEntry.getValue().getSum());
        }

    }
}