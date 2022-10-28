package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


///1.Zapisanie do lokalizacji
///2.Wysyłanie informacji do grupy.
///3.Wycofanie wszystkich subskrybcji.
///4.Wycofanie subkrybcji z danej lokalizacji.
///5.Usunięcie lokalizacj.

public class WeatherAlertService {

    private Set<Location> locations = new HashSet<>();
    private Map<Subscriber, Set<Location>> subscribersInLocation = new HashMap<>();

    public void addSubscriberToLocation(Subscriber subscriber, Location location) {
        if (this.subscribersInLocation.containsKey(subscriber)) {
            subscribersInLocation.get(subscriber).add(location);
        } else {
            locations.add(location);
            subscribersInLocation.put(subscriber, locations);
        }
    }

    public void sendDailyNotification() {
        subscribersInLocation.forEach((key, value) -> key.receiveNotification());

    }

    public void sendAlertToGroup(Location location) {
        subscribersInLocation.entrySet()
                .stream()
                .filter(s -> s.getValue().contains(location))
                .forEach(s -> s.getKey().receiveWeatherAlert(location));
    }

    public void removeSubscriberFromAllSubcribedLocation(Subscriber subscriber) {
        subscribersInLocation.remove(subscriber);
    }

    public void removeSubscriberFromOneLocation(Subscriber subscriber, Location location) {
        for (Map.Entry<Subscriber, Set<Location>> subscribersMap : subscribersInLocation.entrySet()) {
            if (subscribersMap.getKey().equals(subscriber)) {
                subscribersMap.getValue().remove(location);
            }
            if (subscribersMap.getValue().isEmpty()) {
                subscribersInLocation.remove(subscriber);
            }

        }
    }
    public void removeFromLocation(Location location){
        locations.remove(location);
    }
}