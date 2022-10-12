package com.kodilla.bank.homework;

;

public class Bank {

        private CashMachine[] cashMachines;
        //        private CashMachine values;
//        private CashMachine recall;
//        private CashMachine deposit;
//        private CashMachine depositSum;
        private int size;
        //private CashMachine depositAverage;
        // int numberOfAtm;//
        // int totalDeposits;//
        // int totalRecall;//

        // double depositAverage;   // double bo srednia//
        // double recallAverage;//
        // public int totalBalance;//


        public Bank() {
//                this.cash = new int[0];
//                this.size = 0;
//                this.values = new CashMachine();
//                this.recall = new CashMachine();
//                this.deposit = new CashMachine();
//                this.depositSum = new CashMachine();
//                this.depositAverage = new CashMachine();


        }

        public void addMachine(CashMachine cashMachine) {
                this.size++;
                CashMachine[] newTab = new CashMachine[this.size];
                System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
                newTab[this.size - 1] = cashMachine;
                cashMachines = newTab;
        }

        public int totalBalance() {
                int totalBalance = 0;
                for (int i = 0; i < cashMachines.length; i++) {
                        totalBalance += cashMachines[i].getBalance();
                }
                return totalBalance;

        }

        public int totalRecalls() {
                int totalRecalls = 0;
                for (int i = 0; i < cashMachines.length; i++) {
                        totalRecalls += cashMachines[i].getRecall();
                }
                return totalRecalls;
        }

        public int averageOfBalance() {
                int averageOfBalance = 0;
                for (int i = 0; i < cashMachines.length; i++) {
                        averageOfBalance += cashMachines[i].getAverageOfRecall();
                }
                return averageOfBalance;
        }


        public int averageOfRecall() {
                int averageOfRecall = 0;
                for (int i = 0; i < cashMachines.length; i++) {
                        averageOfRecall += cashMachines[i].getAverageOfRecall();

                }
                return averageOfRecall;
        }


}
