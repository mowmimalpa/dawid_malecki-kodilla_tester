package com.kodilla.mockito.NotificationServiceApp;

import com.kodilla.mockito.NotificationServiceApp.notification.Client;
import com.kodilla.mockito.NotificationServiceApp.notification.Notification;

import java.util.HashSet;
import java.util.Set;

public class NotificationService {

    private Set<Client> clients = new HashSet<>();

    public void addSubscriber(Client client) {
        this.clients.add(client);
    }

    public void sendNotification(Notification notification) {
        this.clients.forEach(client -> client.receive(notification));
    }

    public void removeSubscriber(Client client){
        this.clients.remove(client);

    }
}