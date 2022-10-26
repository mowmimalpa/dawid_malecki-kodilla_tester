package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order getOrder(int index) {
        if (index > 0 && index < orders.size()) {
            return this.orders.get(index);
        }
        return null;
    }

    public List<Order> returnListOfOrdersByDate(LocalDate date1, LocalDate date2) {
        List<Order> ordersFromTwoDates = new ArrayList<>();
        for (Order orderByDate : orders) {
            if (orderByDate.getDate().isAfter(date1) && orderByDate.getDate().isBefore(date2)) {
                ordersFromTwoDates.add(orderByDate);
            }
        }
        return ordersFromTwoDates;
    }

    public List<Order> returnOrderByOrderValue(double orderValue1, double orderValue2) {
        List<Order> ordersByValue = new ArrayList<>();
        for (Order order : orders) {
            if (order.getOrderValue() > orderValue1 && order.getOrderValue() < orderValue2) {
                ordersByValue.add(order);
            }
        }
        return ordersByValue;
    }

    public int returnNumberOfOrders() {
        return orders.size();
    }

    public double sumAllOrdersValue() {
        double sumOfOrdersValues = 0;
        for (Order ordersValue : orders) {
            sumOfOrdersValues += ordersValue.getOrderValue();
        }
        return sumOfOrdersValues;
    }
}
//