package com.kodilla.exception.homework;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Warehouse {

    private static Set<Order> orders = new HashSet<>();

    public static Order addOrder(Order order) {
        orders.add(order);
        return order;
    }


    public static Order getOrder(String number) throws OrderDoesntExistException{
        return orders
                .stream()
                .filter(o -> o.getNumber().equals(number))
                .findFirst()
                .orElseThrow(OrderDoesntExistException::new );
    }
}
