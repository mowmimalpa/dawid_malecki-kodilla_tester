package com.kodilla.mockito.NotificationServiceApp;

public interface MobilePhone {

    boolean needsCharging();
    double getFreeStorage();
    void launchApplication(String applicationName);
}