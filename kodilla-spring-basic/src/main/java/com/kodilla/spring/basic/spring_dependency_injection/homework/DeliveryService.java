package com.kodilla.spring.basic.spring_dependency_injection.homework;


import com.kodilla.spring.basic.dependency_injection.homework.Component;

@Component
public class DeliveryService {

    public boolean deliverPackage(String address,double weight){
        if(weight >30){
            return false;

        }
        return true;
    }
}
