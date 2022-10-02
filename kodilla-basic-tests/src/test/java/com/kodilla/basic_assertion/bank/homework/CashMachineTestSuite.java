package com.kodilla.basic_assertion.bank.homework;

import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {


    CashMachine atm = new CashMachine(100000);


    @Test
    public void calculatingHaveZeroLength() {
        int[] transactions = atm.getTransactions();
        assertEquals(0, transactions.length);
    }


    @Test
    public void calculatingAddTransaction() {
        atm.addTransaction(400);
        assertEquals(1, atm.getSize());
        atm.addTransaction(-10);
        assertEquals(2, atm.getSize());


    }

    @Test
    public void calculatingPositiveValue() {
        atm.addTransaction(500);
        assertEquals(1, atm.getDeposit());
    }


    @Test
    public void calculatingRecallNegativeValue() {
        atm.addTransaction(-600);
        assertEquals(1, atm.getRecall());
    }


    @Test
    public void calculatingBalancePositiveValue() {
        atm.addTransaction(400);
        assertEquals(100400, atm.getBalance());
    }


    @Test
    public void calculatingSubtractionFromBalanceNegativeValue() {
        atm.addTransaction(-200);
        assertEquals(90800, atm.getBalance());
    }


    @Test
    public void calculatingSumDeposit() {
        atm.addTransaction(500);
        atm.addTransaction(200);
        atm.addTransaction(400);
        atm.getDepositSum();
        assertEquals(1100, atm.getDepositSum());
    }


    @Test
    public void calculatingNotAddRecallToDeposit() {
        atm.addTransaction(214);
        atm.addTransaction(-55);
        atm.addTransaction(10);
        atm.getDepositSum();
        assertEquals(855, atm.getDepositSum());
    }


    @Test
    public void calculatingAddRecallToDeposit() {
        atm.addTransaction(-500);
        atm.addTransaction(100);
        atm.addTransaction(400);
        atm.getDepositSum();
        assertEquals(-700, atm.getRecallSum());
    }


    @Test
    public void calculatingSumWithRecall() {
        atm.addTransaction(-300);
        atm.addTransaction(-200);
        atm.addTransaction(-100);
        atm.getRecallSum();
        assertEquals(-600, atm.getRecallSum());

    }
}