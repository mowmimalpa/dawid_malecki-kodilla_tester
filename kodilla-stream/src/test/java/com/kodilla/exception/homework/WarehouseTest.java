package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTest {
    private Warehouse warehouse = new Warehouse();


    @Test
    public void shouldOrderExistInList() throws Exception {
        //given
        warehouse.addOrder(new Order("132"));
        warehouse.addOrder(new Order("123"));

        //when
        Order result = warehouse.getOrder("132");

        //then
        assertEquals("132", result.getNumber());

    }

    @Test
    public void shouldOrderDoesntExceptionTheOrderDoesNotExist() throws Exception{
        //given
        warehouse.addOrder(new Order("132"));
        warehouse.addOrder(new Order("150"));

        // then
        assertThrows(OrderDoesntExistException.class,()-> warehouse.getOrder("999"));

}
}