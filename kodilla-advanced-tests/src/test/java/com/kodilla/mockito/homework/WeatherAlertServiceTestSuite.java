package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherAlertServiceTestSuite {
    WeatherAlertService weatherAlertService = new WeatherAlertService();
    Subscriber subscriber1 = Mockito.mock(Subscriber.class);
    Subscriber subscriber2 = Mockito.mock(Subscriber.class);
    Location location1 = Mockito.mock(Location.class);
    Location location2 = Mockito.mock(Location.class);


    @Test
    public void shouldRemoveLocation() {
        weatherAlertService.addSubscriberToLocation(subscriber1, location1);
        weatherAlertService.addSubscriberToLocation(subscriber2, location1);
        weatherAlertService.addSubscriberToLocation(subscriber2, location2);
        weatherAlertService.removeFromLocation(location1);
       weatherAlertService.sendAlertToGroup(location1);
       weatherAlertService.sendAlertToGroup(location2);

        Mockito.verify(subscriber1, Mockito.never()).receiveWeatherAlert(location1);
        Mockito.verify(subscriber2, Mockito.never()).receiveWeatherAlert(location1);
        Mockito.verify(subscriber2, Mockito.times(1)).receiveWeatherAlert(location2);

    }
    @Test
    public void shouldBeRemovedAnyLocation(){
        weatherAlertService.addSubscriberToLocation(subscriber1, location1);
        weatherAlertService.addSubscriberToLocation(subscriber2, location1);
        weatherAlertService.removeFromLocation(location1);
        weatherAlertService.sendAlertToGroup(location1);

        Mockito.verify(subscriber1,Mockito.never()).receiveWeatherAlert(location1);
        Mockito.verify(subscriber2,Mockito.never()).receiveWeatherAlert(location1);

}

    @Test
    public void shouldSendDailyNotificationsToAllSubscribers(){
        weatherAlertService.addSubscriberToLocation(subscriber1, location1);
        weatherAlertService.addSubscriberToLocation(subscriber2, location2);
        weatherAlertService.sendDailyNotification();


        Mockito.verify(subscriber1, Mockito.times(1)).receiveNotification();
        Mockito.verify(subscriber2, Mockito.times(1)).receiveNotification();

    }

    @Test
    public void shouldReceiveNotificationsFromThatLocation(){
        weatherAlertService.addSubscriberToLocation(subscriber1, location1);
        weatherAlertService.addSubscriberToLocation(subscriber2, location1);


        weatherAlertService.sendAlertToGroup(location1);
        weatherAlertService.sendAlertToGroup(location2);

        Mockito.verify(subscriber1, Mockito.times(1)).receiveWeatherAlert(location1);
        Mockito.verify(subscriber2, Mockito.times(1)).receiveWeatherAlert(location1);

    }

    @Test
    public void shouldSendNotificationForThatLocation(){
        weatherAlertService.addSubscriberToLocation(subscriber1,location1);
        weatherAlertService.addSubscriberToLocation(subscriber2,location2);
        weatherAlertService.sendAlertToGroup(location1);
        weatherAlertService.sendAlertToGroup(location2);
    }

    @Test
    public void shouldNotReceiveNotificationsWhenSubscriberQuitSubscription(){
        weatherAlertService.addSubscriberToLocation(subscriber1, location1);
        weatherAlertService.addSubscriberToLocation(subscriber1, location2);
        weatherAlertService.addSubscriberToLocation(subscriber2, location1);
        weatherAlertService.addSubscriberToLocation(subscriber2, location2);
        weatherAlertService.removeSubscriberFromAllSubcribedLocation(subscriber1);
        weatherAlertService.sendAlertToGroup(location1);
        weatherAlertService.sendAlertToGroup(location2);
        weatherAlertService.sendDailyNotification();
        Mockito.verify(subscriber1, Mockito.never()).receiveNotification();
        Mockito.verify(subscriber1, Mockito.never()).receiveWeatherAlert(location1);
        Mockito.verify(subscriber1, Mockito.never()).receiveWeatherAlert(location2);
        Mockito.verify(subscriber2, Mockito.times(1)).receiveWeatherAlert(location1);
        Mockito.verify(subscriber2, Mockito.times(1)).receiveWeatherAlert(location2);
        Mockito.verify(subscriber2, Mockito.times(1)).receiveNotification();
    }

    @Test
    public void shouldReceiveGeneralNotification(){
        weatherAlertService.addSubscriberToLocation(subscriber1,location2);
        weatherAlertService.sendDailyNotification();
        Mockito.verify(subscriber1,Mockito.times(1)).receiveNotification();
    }


}
