package com.kodilla.exception.homework;

import java.util.List;

public class Warehouse {

    private List<Order> orders;

    public Warehouse(List<Order>orders){
        this.orders = orders;
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
