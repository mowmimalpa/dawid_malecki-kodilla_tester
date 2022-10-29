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
    public void subscriberReceivesAlert() {

        weatherAlertService.addSubscriberToLocation(subscriber1, location1);
        weatherAlertService.addSubscriberToLocation(subscriber2, location2);

        weatherAlertService.sendDailyAlert();
        Mockito.verify(subscriber1, Mockito.times(1)).receiveAlert(location1);
        Mockito.verify(subscriber2, Mockito.times(1)).receiveAlert(location2);

    }
    @Test
    public void notSubscriberShouldNotReceiveNotificationsAndAlert(){
        weatherAlertService.sendDailyAlert();
        weatherAlertService.sendAlertToGroup();
        Mockito.verify(subscriber1,Mockito.never()).receiveAlert(location1);
        Mockito.verify(subscriber2,Mockito.never()).receiveNotification();

    }
    @Test
    public void subscribersShouldReceiveNotifications(){
        weatherAlertService.addSubscriberToLocation(subscriber1, location1);
        weatherAlertService.addSubscriberToLocation(subscriber2, location2);

        weatherAlertService.sendAlertToGroup();
        Mockito.verify(subscriber1,Mockito.times(1)).receiveNotification();
        Mockito.verify(subscriber2,Mockito.times(1)).receiveNotification();

    }
    @Test
    public void subscriberShouldUnsubcribe(){
        weatherAlertService.unsubscribeInLocation(subscriber1,location1);
        weatherAlertService.unsubscribeInLocation(subscriber2,location2);
        Mockito.verify(subscriber1,Mockito.times(1)).unsubscribeLocation(location1);
        Mockito.verify(subscriber2,Mockito.times(1)).unsubscribeLocation(location2);
    }

    @Test
    public void subscriberShouldSubscribeOnlyOneTime(){
        weatherAlertService.addSubscriberToLocation(subscriber1, location1);
        weatherAlertService.addSubscriberToLocation(subscriber2, location2);
        Mockito.verify(subscriber1, Mockito.times(1)).subscribeToLocation(location1);
        Mockito.verify(subscriber2, Mockito.times(1)).subscribeToLocation(location2);


    }


}



