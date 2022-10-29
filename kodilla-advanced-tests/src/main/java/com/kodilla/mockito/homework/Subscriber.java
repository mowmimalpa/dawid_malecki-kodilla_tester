package com.kodilla.mockito.homework;

public interface Subscriber {
    void receiveAlert(Location location);
    void receiveNotification();
    void unsubscribeLocation(Location location);
    void subscribeToLocation(Location location);
}
