package com.kodilla.execution_model.homework;

import java.time.LocalDate;

public class Order {

    private double orderValue;
    private LocalDate date;
    private String login;

    public Order(double orderValue, LocalDate date, String login) {
        this.orderValue = orderValue;
        this.date = date;
        this.login = login;
    }

    public double getOrderValue() {
        return orderValue;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderValue=" + orderValue +
                ", date=" + date +
                ", login='" + login + '\'' +
                '}';
    }
}
//