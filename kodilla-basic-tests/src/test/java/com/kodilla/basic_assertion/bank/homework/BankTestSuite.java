package com.kodilla.basic_assertion.bank.homework;

import com.kodilla.bank.homework.Bank;
import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static com.kodilla.basic_assertion.Application1.assertEquals;

public class BankTestSuite {
    Bank theBank = new Bank();
    CashMachine AtmOne = new CashMachine(1000);
    CashMachine AtmTwo = new CashMachine(2000);
    CashMachine AtmThree = new CashMachine(3000);

    @Test
    public void calculatingHaveZeroLength() {
        theBank.getNumberOfAtm();
        assertEquals(0, theBank.getNumberOfAtm());
    }


    @Test
    public void calculatingAddMachine() {
        theBank.addMachine(AtmOne);
        theBank.getNumberOfAtm();
        assertEquals(1, theBank.getNumberOfAtm());
        assertEquals(1000, AtmOne.balance);
        theBank.addMachine(AtmTwo);
        theBank.getNumberOfAtm();
        assertEquals(4, theBank.getNumberOfAtm());
        assertEquals(3000, AtmTwo.balance);
    }


    @Test
    public void calculatingTotalBalance() {
        theBank.addMachine(AtmOne);
        AtmOne.getBalance();
        theBank.addMachine(AtmTwo);
        AtmTwo.getBalance();
        theBank.addMachine(AtmThree);
        AtmThree.getBalance();
        assertEquals(5000, theBank.totalBalance);
    }


    @Test
    public void calculatingTotalDeposits() {
        theBank.addMachine(AtmOne);
        AtmOne.addTransaction(25);
        AtmOne.getDeposit();
        theBank.addMachine(AtmTwo);
        AtmTwo.addTransaction(150);
        AtmTwo.getDeposit();
        theBank.addMachine(AtmThree);
        AtmThree.addTransaction(5000);
        AtmThree.getDeposit();
        theBank.totalDeposits();
        assertEquals(3, theBank.totalDeposits());
    }

    @Test
    public void calculatingTotalRecall() {
        theBank.addMachine(AtmOne);
        AtmOne.addTransaction(-120);
        AtmOne.getRecall();
        theBank.addMachine(AtmTwo);
        AtmTwo.addTransaction(-460);
        AtmTwo.getRecall();
        theBank.addMachine(AtmThree);
        AtmThree.addTransaction(-1);
        AtmThree.getRecall();
        theBank.totalRecall();
        assertEquals(4, theBank.totalRecall());
    }


    @Test
    public void calculatingZeroDeposits() {
        theBank.addMachine(AtmOne);
        AtmOne.getDeposit();
        theBank.addMachine(AtmTwo);
        AtmTwo.getDeposit();
        assertEquals(0, theBank.totalDeposits());
    }


    @Test
    public void calculatingAverageDepositWithZero() {
        theBank.addMachine(AtmOne);
        theBank.addMachine(AtmTwo);
        AtmOne.getDeposit();
        AtmOne.getDepositSum();
        AtmTwo.getDeposit();
        AtmTwo.getDepositSum();
        theBank.totalDeposits();
        theBank.totalDepositAverage();
        assertEquals(0, (int) theBank.totalDepositAverage());
    }


    @Test
    public void calculatingAverageRecall() {
        theBank.addMachine(AtmOne);
        theBank.addMachine(AtmTwo);
        AtmOne.addTransaction(-100);
        AtmOne.addTransaction(-200);
        AtmOne.getRecall();
        AtmOne.getRecallSum();
        AtmTwo.addTransaction(-1);
        AtmTwo.addTransaction(-4);
        AtmTwo.getRecall();
        AtmTwo.getRecallSum();
        theBank.totalRecall();
        theBank.totalRecallAverage();
        assertEquals(-305, (int) theBank.totalRecallAverage());
    }


    @Test
    public void calculatingAverageZeroWithRecall() {
        theBank.addMachine(AtmOne);
        theBank.addMachine(AtmTwo);
        AtmOne.getRecall();
        AtmOne.getRecallSum();
        AtmTwo.getRecall();
        AtmTwo.getRecallSum();
        theBank.totalRecall();
        theBank.totalRecallAverage();
        assertEquals(0, (int) theBank.totalRecallAverage());
    }


    @Test
    public void calculatingTotalZeroRecall() { //
        theBank.addMachine(AtmOne);
        AtmOne.getRecall();
        theBank.addMachine(AtmTwo);
        AtmTwo.getRecall();
        assertEquals(0, theBank.totalRecall());
    }

    @Test
    public void calculatingDepositAverage() {
        theBank.addMachine(AtmOne);
        theBank.addMachine(AtmTwo);
        AtmOne.addTransaction(600);
        AtmOne.addTransaction(250);
        AtmOne.getDeposit();
        AtmOne.getDepositSum();
        AtmTwo.addTransaction(20);
        AtmTwo.addTransaction(40);
        AtmTwo.getDeposit();
        AtmTwo.getDepositSum();
        theBank.totalDeposits();
        theBank.totalDepositAverage();
        assertEquals(200, (int) theBank.totalDepositAverage());

    }
}