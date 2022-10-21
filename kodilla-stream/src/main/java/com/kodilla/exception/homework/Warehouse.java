package com.kodilla.exception.homework;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Warehouse {

    private Set<Order> orders;

    public Warehouse(){
        orders = new HashSet<>();
    }
    public void addOrder(Order order){
        orders.add(order);
    }

    public Order getOrder(String number) throws Exception{
        return orders.stream()
                .filter(o -> o.getNumber().contains(number))
                .findFirst()
                .orElseThrow(OrderDoesntExistException::new );
    }
}
