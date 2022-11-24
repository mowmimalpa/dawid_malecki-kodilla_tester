package com.kodilla.spring.basic.dependency_injection;

public class EmailMessageService implements MessageService {
    @Override
    public void send(String message, String receiver) {
        System.out.println("Sending [" + message + "] to: " + receiver + " via Email");
    }
}