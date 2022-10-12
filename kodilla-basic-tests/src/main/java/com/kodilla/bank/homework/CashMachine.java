package com.kodilla.bank.homework;

public class CashMachine {

    int[] transactions;

    public int size;


    public CashMachine() {
        this.transactions = new int[0];
        this.size = 0;

    }


    public void addTransaction(int value) {
        if (value == 0) {
            return;
        } else {
            this.size++;
            int[] newTransactions = new int[this.size];
            System.arraycopy(transactions, 0, newTransactions, 0, transactions.length);
            newTransactions[this.size - 1] = value;
            this.transactions = newTransactions;

        }
    }


    public int[] getTransactions() {


        return transactions;
    }

    public int getBalance() {
        int sum = 0;
        for (int i = 0; i < transactions.length; i++) {
            sum += this.transactions[i];

        }
        return sum;

    }

    public int getRecall() {
        int sum = 0;
        for (int i = 0; i < transactions.length; i++) {
            sum += this.transactions[i];
        }
        return sum;
    }


    public double getAverageOfRecall() {
        if (this.getRecall() == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.getRecall(); i++) {
            sum += this.getRecall();
        }
        return sum;
    }

    public double getAverageOfDeposit() {
        if (this.getBalance() == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.getBalance(); i++) {
            sum += this.getBalance();
        }
        return sum;
    }
}






// private int[] values;
//    private int size;
//
//    public Grades() {
//        this.size = 0;
//        this.values = new int[0];
//    }
//
//    public void add(int value) {
//        this.size++;
//        int[] newTab = new int[this.size];
//        System.arraycopy(values, 0, newTab, 0, values.length);
//        newTab[this.size - 1] = value;
//        this.values = newTab;
//    }
//    public double getAverage() {
//        if (this.values.length == 0) {
//            return 0;
//        }
//        double sum = 0;
//        for(int i = 0; i < this.values.length; i++) {
//            sum += this.values[i];
//        }
//        return sum/this.values.length;
//    }
//
//
//    public int[] getValues() {
//        return values;
//    }



// Dodaj metody zwracające saldo bankomatu
// oraz liczbę wykonanych transakcji. Utwórz klasę Bank,
// która będzie zawierać tablicę bankomatów.
// Bank powinien mieć metody zwracające:
//
//całkowity bilans ze wszystkich bankomatów,
//liczbę transakcji związanych z wypłatą,
//liczbę transakcji związaną z wpłatą pieniędzy,
//średnią wartość wypłaty,
//średnią wartość wpłat