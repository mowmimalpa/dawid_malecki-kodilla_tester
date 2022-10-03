package com.kodilla.bank.homework;

;

public class Bank {

        private int[] cash;
        private CashMachine values;
        private CashMachine recall;
        private CashMachine deposit;
        private CashMachine depositSum;
        private int size;
        private CashMachine depositAverage;
        // int numberOfAtm;//
        // int totalDeposits;//
        // int totalRecall;//

        // double depositAverage;   // double bo srednia//
        // double recallAverage;//
        // public int totalBalance;//


        public Bank() {
                this.cash = new int[0];
                this.size = 0;
                this.values = new CashMachine();
                this.recall = new CashMachine();
                this.deposit = new CashMachine();
                this.depositSum = new CashMachine();
                this.depositAverage = new CashMachine();


        }

        public void addMachine(int value) {
                this.size++;
                int[] newTab = new int[this.size];
                System.arraycopy(values, 0, newTab, 0, cash.length);
                newTab[this.size - 1] = value;
                this.cash = newTab;
        }

        public int getRecallSum() { // wypłaty
                return this.recall.getRecallSum();
        }

        public int totalDeposit(){ // wpłaty
                return this.deposit.getDepositSum();


        }
        public double getRecallAverage() { // srednia wypłaty
                return this.recall.getAverageOfRecall();
        }
        public double getDepositAverage() {// średnia wpłaty
                return this.deposit.getAverageOfDeposit();

        }
        public int allBalance() {
                return allBalance();
        }




}
