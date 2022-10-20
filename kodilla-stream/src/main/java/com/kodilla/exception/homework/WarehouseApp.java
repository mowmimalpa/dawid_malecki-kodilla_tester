package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WarehouseApp {
    public static void main (String[]args){
        List<Order> orders = new ArrayList<>();
        Warehouse warehouse = new Warehouse(orders);
        warehouse.addOrder(new Order("987654"));
        warehouse.addOrder(new Order("321321"));
       warehouse.addOrder(new Order ("123456"));


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Wprowadz numer zlecenia: ");
            String order = scanner.nextLine();
            try {
                System.out.println("Twój numer zamówienia: " + warehouse.getOrder(order));
                break;
            }catch (Exception e){
                System.out.println("Zły numer zamówienia");
            }
        }
    }
}
//int i = 0;
//while (i < 10) {
//  System.out.println(i);
//  i++;
//  if (i == 4) {
//    break;
//  }