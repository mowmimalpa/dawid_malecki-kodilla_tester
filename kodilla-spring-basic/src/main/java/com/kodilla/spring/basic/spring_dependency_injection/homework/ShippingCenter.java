package com.kodilla.spring.basic.spring_dependency_injection.homework;

import com.kodilla.spring.basic.dependency_injection.homework.Component;
import org.springframework.beans.factory.annotation.Autowired;


// tutaj dodaj odpowiednie wstrzykiwanie zależności


@Component
public class ShippingCenter {

    @Autowired
    private DeliveryService deliveryService;

    @Autowired
    private NotificationService notificationService;

    public String sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            return notificationService.success(address);
        }
        return notificationService.fail(address);
    }
}