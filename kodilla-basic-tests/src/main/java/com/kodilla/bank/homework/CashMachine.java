package com.kodilla.bank.homework;

public class CashMachine {

    int [] transactions;
   public int balance;
    public int size;
    public int deposit;
    public static int recall;

    public int depositSum;

    public int recallSum;









    public CashMachine () {
        this.transactions = new int[0];
        this.size = 0;
        this.balance = balance;
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
            System.out.println("Bilans środków " + this.getBalance());
            if (value > 0) {
                this.deposit++;
                balance += value;
                System.out.println("Wpłacono " + value);
            } else if (value < 0) {
                if (balance < value * -1) {
                    System.out.println("Brak środków w bankomacie");
                } else {
                    this.recall++;
                    balance += value;
                    System.out.println("Wypłacono " + value * -1);
                }
            } else {
                System.out.println("Nie zmieniono stanu konta.");

            }
            System.out.println("Saldo " + this.getBalance());
            System.out.println("Lącznie wpłat: " + this.getDeposit());
            System.out.println("Bilans środków:"+" " + this.getRecall());
            System.out.println("Laczna ilość operacji: " + this.getSize());
        }
    }
    public int getDepositSum() {
        depositSum = 0;
        for(int i = 0; i < transactions.length; i++) {
            if(transactions[i] > 0) {
                depositSum += transactions[i];
            }
        }
        return depositSum;
    }

    public int getRecallSum() {
        recallSum = 0;
        for(int i = 0; i < transactions.length; i++) {
            if(transactions[i] < 0) {
                recallSum += transactions[i];
            }
        }

//        return recallSum+this.transactions.length;
//    }
//    public int[] getTransactions() {
//
//        return transactions;
//    }
//    public int getBalance() {
//        return balance;
//    }
//    public int getSize() {
//
//        return size;
//    }
//    public int getDeposit() {
//
//        return deposit;
//    }
//    public int getRecall() {
//
//        return recall;
//    }
//}






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