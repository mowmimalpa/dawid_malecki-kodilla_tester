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
                this.size =0;
                this.cashMachines = new CashMachine[0];
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
                this.cashMachines = newTab;
        }
        public CashMachine[] getCashMachine(){
                return cashMachines;
        }

        public int totalBalance() {   /// całość wpłat
                int totalBalance = 0;
                for (int i = 0; i < cashMachines.length; i++) {
                        totalBalance += cashMachines[i].getBalance();
                }
                return totalBalance;

        }

        public int totalRecalls() {  /// całość wypłat
                int totalRecalls = 0;
                for (int i = 0; i < cashMachines.length; i++) {
                        totalRecalls += cashMachines[i].getRecall();
                }
                return totalRecalls;
        }

        public int averageOfBalance() { /// średnia wpłat
                int totalBalance = totalBalance();
                int numberOfInput = 0;
                for (int i = 0; i < cashMachines.length; i++) {
                        numberOfInput += cashMachines[i].bankTransactions();
                }
                return totalBalance/numberOfInput;
        }


        public int averageOfRecall() { /// średnia wypłat
                int totalRecall = totalRecalls();
                int numberOfInput1 = 0;
                for (int i = 0; i < cashMachines.length; i++) {
                        numberOfInput1 += cashMachines[i].bankTransactionsRecall();

                }
                return totalRecall/numberOfInput1;
        }

        public int accBalance() { /// cały bilans
                int accBalance = 0;
                for (int i = 0; i < cashMachines.length; i++) {
                        accBalance += cashMachines[i].accBalance();
                }
                        return accBalance;
                }


        }

