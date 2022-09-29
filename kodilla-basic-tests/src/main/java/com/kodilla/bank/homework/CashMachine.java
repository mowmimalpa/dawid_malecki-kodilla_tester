package com.kodilla.bank.homework;

public class CashMachine {

    int balance;
    int size;
    int deposit;
    int recall;
    String name;
    int [] transactions;







    public CashMachine () {
        this.name = name;
        this.transactions = new int[0];
        this.size = 0;
        this.balance = balance;
    }

        public void addTransaction(int value) {
            this.size++;
            int[] newTransactions = new int[this.size];
            System.arraycopy(transactions, 0, newTransactions, 0, transactions.length);
            newTransactions[this.size - 1] = value;
            this.transactions = newTransactions;
            System.out.println("Bilans środków" + this.name + " " + this.balance);
            if (value > 0) {
                this.deposit++;
                balance += value;
                System.out.println("Wpłacono środki" + value);
            } else if (value < 0) {
                if (balance < value * -1) {
                    System.out.println("Brak środków w bankomacie");
                } else {
                    this.recall++;
                    balance += value;
                    System.out.println("Wypłacono" + value * -1 + "z konta");

                }
                System.out.println("Bilans środków" + name + " " + balance);
                System.out.println("Laczna ilość operacji:" + this.size);


            }
        }


    public double getAverage() {
        if (this.transactions.length == 0) {
            return 0;
        }
        double sum = 0;
        for(int i = 0; i < this.transactions.length; i++) {
            sum += this.transactions[i];
        }
        return sum/this.transactions.length;
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