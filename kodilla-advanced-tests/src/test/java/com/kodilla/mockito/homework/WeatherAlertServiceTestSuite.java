package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherAlertServiceTestSuite {
    WeatherAlertService weatherAlertService = new WeatherAlertService();
    NotificationAlert notificationAlert = Mockito.mock(NotificationAlert.class);
    Subscriber subscriber1 = Mockito.mock(Subscriber.class);
    Subscriber subscriber2 = Mockito.mock(Subscriber.class);
    Location location1 = Mockito.mock(Location.class);
    Location location2 = Mockito.mock(Location.class);

    @Test//
    public void  notificationCanBeSendToAllSubscribers() {

        weatherAlertService.addSubscriber(subscriber1, location1);
        weatherAlertService.addSubscriber(subscriber2, location2);

        weatherAlertService.sendNotificationAlertToAllSubscribers(notificationAlert);
        Mockito.verify(subscriber1, Mockito.times(1)).receiveNotificationAlert(notificationAlert);
        Mockito.verify(subscriber2, Mockito.times(1)).receiveNotificationAlert(notificationAlert);

    }

    @Test
    public void subscribersShouldReceiveNotificationsFromHisLocation() {
        weatherAlertService.addSubscriber(subscriber1, location1);
        weatherAlertService.addSubscriber(subscriber2, location2);

        weatherAlertService.sendNotification(location1);
        weatherAlertService.sendNotification(location2);
        Mockito.verify(subscriber1, Mockito.times(1)).receive(location1);
        Mockito.verify(subscriber2, Mockito.times(1)).receive(location2)
        ;

    }

    @Test
    public void subscriberShouldUnsubcribe() {
        weatherAlertService.addSubscriber(subscriber1, location1);
        weatherAlertService.addSubscriber(subscriber2, location2);
        weatherAlertService.removeLocation(location1);
        weatherAlertService.removeLocation(location2);
        Mockito.verify(subscriber1, Mockito.times(0)).receive(location1);
        Mockito.verify(subscriber2, Mockito.times(0)).receive(location2);
    }
    @Test
    public void unsubscribedShouldNotReceiveNotification(){
        Location city1 = Mockito.mock(Location.class);
        Subscriber client = Mockito.mock(Subscriber.class);
        weatherAlertService.sendNotification(city1);
        Mockito.verify(client, Mockito.never()).receive(city1);

    }

    @Test
    public void shouldDeleteAllSubscription(){
        weatherAlertService.addSubscriber(subscriber1, location1);
        weatherAlertService.addSubscriber(subscriber1, location2);
        weatherAlertService.removeSubscriber(subscriber1,location1);
        weatherAlertService.removeSubscriber(subscriber1,location2);
        Mockito.verify(subscriber1, Mockito.times(0)).receive(location2);
        Mockito.verify(subscriber1, Mockito.times(0)).receive(location1);


    }





}



