package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTest {
    static List<Order> orders = new ArrayList<>();
    static Warehouse warehouse = new Warehouse(orders);


    @Test
    void shouldOrderExistInList() throws Exception {
        //given
        Order order = new Order("132");
        warehouse.addOrder(order);

        //when
        Order result = warehouse.getOrder("132");

        //then
        assertEquals(order, result);

    }

    @Test
    void shouldOrderDoesntExceptionTheOrderDoesNotExist(){
        //given
        Order order = new Order("132");
        warehouse.addOrder(order);

        // then
        assertThrows(OrderDoesntExistException.class,()-> warehouse.getOrder("999"));

}
}