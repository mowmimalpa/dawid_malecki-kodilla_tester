package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {


    public static void main(String[] args) {
        DeliveryService deliveryService = new CountryDeliveryService();
        NotificationService notificationService = new CountryNotificationService();
        ShippingCenter shippingCenter = new ShippingCenter(deliveryService, notificationService);
        shippingCenter.sendPackage("Wiejska 10,Warszawa", 20.1);


        DeliveryService deliveryService2 = new CountryDeliveryService();
        NotificationService notificationService2 = new CountryNotificationService();
        ShippingCenter shippingCenter2 = new ShippingCenter(deliveryService2, notificationService2);
        shippingCenter2.sendPackage("Chrobrego 12, Poznań", 5.8);

    }
}