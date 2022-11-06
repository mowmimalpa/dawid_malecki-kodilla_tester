package com.kodilla.spring.basic.dependency_injection.homework;

public class CountryDeliveryService implements DeliveryService{

    @Override
    public boolean deliverPackage(String address, double weight){
        if (weight > 30) {
            System.out.println("Package too heavy");
            return false;
        }
        System.out.println("Domestic delivering in progress...");
        return true;
    }
}