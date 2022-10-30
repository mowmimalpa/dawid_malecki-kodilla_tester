package com.kodilla.mockito.homework;

import java.util.*;

public class WeatherAlertService {


    private Map<Subscriber, List<Location>> alertSystem = new HashMap<>();


    public void addSubscriber(Subscriber myClient, Location location) {

        List<Location> locationList = new ArrayList<>();

        if (this.alertSystem.containsKey(myClient)) {
            alertSystem.get(myClient).add(location);
        } else {
            locationList.add(location);
            alertSystem.put(myClient, locationList);
        }
    }
    public void removeSubscriber(Subscriber myClient, Location location) {

        List<Location> locationList = alertSystem.get(myClient);
        if (locationList != null) {
            locationList.remove(location);
            if (locationList.isEmpty()) {
                alertSystem.remove(myClient);
            }
        }



    }
    public void sendNotification(Location location) {

        alertSystem.entrySet()
                .stream()
                .filter(n -> n.getValue().contains(location))
                .forEach(n -> n.getKey().receive(location));
    }
    public void sendNotificationAlertToAllSubscribers(NotificationAlert notificationAlert) {
        alertSystem.entrySet()
                .stream()
                .forEach(n -> n.getKey().receiveNotificationAlert(notificationAlert));
    }

    public void removeLocation(Location location) {
//      this.locationList.remove(location);
        this.alertSystem.remove(location);
    }
}