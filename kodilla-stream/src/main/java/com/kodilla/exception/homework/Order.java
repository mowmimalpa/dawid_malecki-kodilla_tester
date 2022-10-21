package com.kodilla.exception.homework;

import java.util.Objects;

public class Order {
    private String number;

    public Order(String number){
        this.number = number;

    }
    public String getNumber(){
        return number;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order order)) return false;
        return getNumber().equals(order.getNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber());
    }

    @Override
    public String toString(){
        return "Order{" +
                "number='" + number + '\'' +
                '}';
    }
}
