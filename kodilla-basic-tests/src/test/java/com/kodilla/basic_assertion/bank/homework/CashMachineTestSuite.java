package com.kodilla.basic_assertion.bank.homework;

import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {


    CashMachine atm = new CashMachine();



    @Test
    public void ShouldAddHaveZeroLength() {
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
    public void shouldAddPositiveValue() {
        atm.addTransaction(500);
        assertEquals(1, atm.bankTransactions());
    }


    @Test
    public void ShouldAddRecallNegativeValue() {
        atm.addTransaction(-600);
        assertEquals(1, atm.bankTransactionsRecall());
    }


    @Test
    public void ShouldAddBalancePositiveValue() {
        atm.addTransaction(400);
        assertEquals(400, atm.getBalance());
    }


    @Test
    public void ShouldAddSubtractionFromBalanceNegativeValue() {
        atm.addTransaction(-200);
        assertEquals(-200, atm.getBalance());
    }


    @Test
    public void ShouldAddSumDeposit() {
        atm.addTransaction(500);
        atm.addTransaction(200);
        atm.addTransaction(400);

        assertEquals(1100, atm.getBalance());
    }


    @Test
    public void ShouldNotAddRecallToDeposit() {
        atm.addTransaction(200);
        atm.addTransaction(-50);
        atm.addTransaction(10);

        assertEquals(160,atm.getBalance());
    }


    @Test
    public void ShouldAddRecallToDeposit() {
        atm.addTransaction(-500);
        atm.addTransaction(100);
        atm.addTransaction(400);
        assertEquals(0, atm.getBalance());
    }


    @Test
    public void ShouldAddSumWithRecall() {
        atm.addTransaction(-300);
        atm.addTransaction(-200);
        atm.addTransaction(-100);
        assertEquals(-600, atm.getRecall());

    }

    @Test
    public void ShouldAddNumberOfTransaction(){
        atm.addTransaction(100);
        atm.addTransaction(200);
        atm.addTransaction(-100);
        atm.addTransaction(-200);
        assertEquals(2,atm.bankTransactions());
        assertEquals(2,atm.bankTransactionsRecall());

    }
}