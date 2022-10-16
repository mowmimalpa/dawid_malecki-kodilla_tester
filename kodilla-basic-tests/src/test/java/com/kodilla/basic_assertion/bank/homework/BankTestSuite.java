package com.kodilla.basic_assertion.bank.homework;

import com.kodilla.bank.homework.Bank;
import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    Bank theBank = new Bank();
    CashMachine AtmOne = new CashMachine();
    CashMachine AtmTwo = new CashMachine();
    CashMachine AtmThree = new CashMachine();

    @Test
    public void calculatingHaveZeroLength() {
        theBank.addMachine(AtmOne);
        theBank.addMachine(AtmTwo);
        AtmOne.addTransaction(100);
        AtmTwo.addTransaction(200);
        assertEquals(300, theBank.totalBalance());
    }

//
//    @Test
//    public void ShouldAddMachine() {
//        theBank.addMachine(AtmOne);
//        theBank.getNumberOfAtm();
//        assertEquals(1, theBank.getNumberOfAtm());
//        assertEquals(1000, AtmOne.balance);
//        theBank.addMachine(AtmTwo);
//        theBank.getNumberOfAtm();
//        assertEquals(4, theBank.getNumberOfAtm());
//        assertEquals(3000, AtmTwo.balance);
//    }


    @Test
    public void ShouldAddTotalBalance() {
        theBank.addMachine(AtmOne);
        theBank.addMachine(AtmTwo);
        theBank.addMachine(AtmThree);
        assertEquals(0, theBank.totalBalance());
    }


    @Test
    public void ShouldAddTotalDeposits() {
        theBank.addMachine(AtmOne);
        AtmOne.addTransaction(20);
        AtmOne.addTransaction(20);
        theBank.addMachine(AtmTwo);
        AtmTwo.addTransaction(-50);
        theBank.addMachine(AtmThree);
        AtmThree.addTransaction(20);
        assertEquals(10, theBank.totalBalance());
    }

    @Test
    public void ShouldAddTotalRecall() {
        theBank.addMachine(AtmOne);
        AtmOne.addTransaction(-100);
        AtmOne.getRecall();
        theBank.addMachine(AtmTwo);
        AtmTwo.addTransaction(-200);
        AtmTwo.getRecall();
        theBank.addMachine(AtmThree);
        AtmThree.addTransaction(-120);
        AtmThree.getRecall();
        assertEquals(-420, theBank.totalRecalls());
    }


    @Test
    public void ShouldNotCountTotalZeroDeposits() {
        theBank.addMachine(AtmOne);
        AtmOne.addTransaction(0);
        AtmOne.addTransaction(0);
        theBank.addMachine(AtmTwo);
        AtmTwo.addTransaction(0);
        AtmTwo.addTransaction(0);

        assertEquals(0, theBank.accBalance());
    }

    @Test
    public void shouldCountRecallAverage(){ // wypłaty
        theBank.addMachine(AtmOne);
        AtmOne.addTransaction(-400);
    AtmOne.addTransaction(-200);
        theBank.addMachine(AtmTwo);
    AtmTwo.addTransaction(-100);
    AtmTwo.addTransaction(-100);
    assertEquals(-200,theBank.averageOfRecall());



    }

    @Test
    public void shouldCountBalanceAverage(){ // wpłaty
        theBank.addMachine(AtmOne);
        AtmOne.addTransaction(400);
        AtmOne.addTransaction(200);
        theBank.addMachine(AtmThree);
        AtmThree.addTransaction(100);
        AtmThree.addTransaction(100);
        assertEquals(200, theBank.averageOfBalance());


    }
}


