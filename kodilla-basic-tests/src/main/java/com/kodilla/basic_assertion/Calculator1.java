package com.kodilla.basic_assertion;




public class Calculator1 {
    public static void main(String[] args) {
        Calculator1 calculator1 = new Calculator1();
        int a = 3;
        int square = a * a;
        int c = 12-6;

        boolean correct = Application1.assertEquals(9,square);
        boolean odejmowanie = Application1.assertEquals(6,c);
        if (correct) {
            System.out.println("Metoda podnoszenia działa poprawnie");
        } else {
            System.out.println("Metoda podnoszenia nie działa poprawnie");
        } if (odejmowanie) {
            System.out.println("Metoda odejmowania działa poprawnie");
        } else {
            System.out.println("Metoda odejmowania nie działa poprawnie");

        }
    }
}