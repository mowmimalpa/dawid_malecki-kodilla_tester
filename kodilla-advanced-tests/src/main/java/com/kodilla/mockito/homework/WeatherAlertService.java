package com.kodilla.mockito.homework;

import java.util.HashMap;

public class WeatherAlertService {


    public HashMap<Subscriber,Location> subscribersInLocation = new HashMap<>();
    public int getMapSize(){
        return subscribersInLocation.size();
    }


    public void addSubscriberToLocation(Subscriber subscriber, Location location) {
        if (this.subscribersInLocation.get(subscriber)!=location){
            this.subscribersInLocation.put(subscriber,location);
            subscriber.subscribeToLocation(location);

        }
    }

    public void sendDailyAlert() {
        subscribersInLocation.forEach((subscriber, location) -> subscriber.receiveAlert(location));

    }

    public void sendAlertToGroup() {
        this.subscribersInLocation.forEach((subscriber, location) -> subscriber.receiveNotification());
    }

    public void unsubscribeInLocation(Subscriber subscriber,Location location){
    if(this.subscribersInLocation.get(subscriber)==location)
    this.subscribersInLocation.remove(subscriber,location);
    subscriber.unsubscribeLocation(location);
    }
}





