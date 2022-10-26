package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


//1.Rozmiar listy powinien się zmienić po dodaniu zamówienia.
//2.Powinien zwracać wartość null podczas nieistniejącego indexu.
//3.Powinien zwrócić zamówienie według indexu.
//4.Powinien zwrócić zamówienia z dwóch dat.
//5.Powinien zwracać zamówienia na podstawie wartości zamówienia.
//6.Powinien zwracać ilość zamówień.
//7.Powinien sumować wszystkie zamówienia.

class ShopTest {
    Shop shoppingList = new Shop();
    Order order1 = new Order(10, LocalDate.of(2022, 10, 2), "Kasia");
    Order order2 = new Order(12, LocalDate.of(2022, 4, 22), "Piotr");
    Order order3 = new Order(14, LocalDate.of(2022, 5, 24), "Przemek");
    Order order4 = new Order(16, LocalDate.of(2022, 5, 15), "Ola");

    @Test //1
    public void theListSizeChangeAfterAddOrder() {
        //when
        int numberOfOrders = shoppingList.returnNumberOfOrders();
        //then
        assertEquals(4, numberOfOrders);
    }

    @Test //2
    public void shouldReturnNullWhenIndexDoesNotExist(){
        Order result = shoppingList.getOrder(4);
        assertNull(result);

    }

    @Test //3
    public void shouldReturnOrderByIndex(){
        //when
        Order getIndex = shoppingList.getOrder(2);
        //then
        assertEquals(14,getIndex.getOrderValue(),0.01);
        assertEquals(LocalDate.of(2022,5,24),getIndex.getDate() );
        assertEquals("Przemek",getIndex.getLogin());
    }

    @Test//4
    public void shouldReturnOrdersFromTwoDates(){
        //when
        LocalDate date1 = LocalDate.of(2022,10,2);
        LocalDate date2 = LocalDate.of(2022,5,15);
        List<Order> ordersFromTwoDates = shoppingList.returnListOfOrdersByDate(date1,date2);
        int ordersFromTwoDatesSize = ordersFromTwoDates.size();
        //then
        assertEquals(0,ordersFromTwoDatesSize);


    }

    @Test //5
    public void shouldReturnOrdersTakingIntoTheValues(){
        //when
        double orderValue1 = 14;
        double orderValue2 = 16;
        List<Order> returnOrderByValue = shoppingList.returnOrderByOrderValue(orderValue1,orderValue2);
        int ordersFromTwoValues = returnOrderByValue.size();
        // then
        assertEquals(0,ordersFromTwoValues);
    }

    @Test //6
    public void shouldReturnNumberOfOrders(){
        int numberOfOrders = shoppingList.returnNumberOfOrders();
        assertEquals(4,numberOfOrders);
    }
    @Test//8
    public void shouldSumAllOrders(){
        double allOrders = shoppingList.sumAllOrdersValue();
        assertEquals(52,allOrders);
    }

    @BeforeEach
    public void addOrders(){
        shoppingList.addOrder(order1);
        shoppingList.addOrder(order2);
        shoppingList.addOrder(order3);
        shoppingList.addOrder(order4);
    }

}


