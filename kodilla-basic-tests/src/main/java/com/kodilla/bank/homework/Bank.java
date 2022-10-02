package com.kodilla.bank.homework;

;

public class Bank {

        public CashMachine[] theAtm;
        int numberOfAtm;
        int totalDeposits;
        int totalRecall;
        double depositAverage;   // double bo srednia
        double recallAverage;
        public int totalBalance;


        public Bank() {
                theAtm = new CashMachine[0];
                this.numberOfAtm = 0;

        }

        public void addMachine(CashMachine balance) {
                this.numberOfAtm++;
                CashMachine[] newTab = new CashMachine[this.numberOfAtm];
                System.arraycopy(theAtm, 0, newTab, 0, theAtm.length);
                newTab[this.numberOfAtm - 1] = balance;
                this.theAtm = newTab;
        }

        public int getNumberOfAtm() {
                return numberOfAtm;
        }
        public int totalDeposits(){
                totalDeposits = 0;
                for(int i = 0; i < theAtm.length; i++){
                        if (theAtm[i].deposit==0) {
                                return 0;
                        } else {
                                totalDeposits += theAtm[i].getDeposit();
                        }

                }
                return totalDeposits;

        }
        public double totalDepositAverage() {
                if (totalDeposits == 0) {
                        return 0;
                } else {
                        depositAverage = 0;
                        int sum = 0;
                        for (int i = 0; i < theAtm.length; i++) {
                                sum += theAtm[i].depositSum;
                        }
                        depositAverage = sum / totalDeposits;
                        return depositAverage;
                }
        }
                public int totalRecall() {
                        totalRecall = 0;
                        for (int i = 0; i < theAtm.length; i++) {
                                if (theAtm[i].recall == 0) {
                                        return 0;
                                } else {
                                        totalRecall += theAtm[i].getRecallSum();
                                }
                        }
                        return totalRecall;
                }

        public double totalRecallAverage() {
                if (totalRecall== 0) {
                        return 0;
                } else {
                        recallAverage = 0;
                        int sum = 0;
                        for (int i = 0; i < theAtm.length; i++) {
                                sum += theAtm[i].recallSum;
                        }
                        recallAverage  = sum / totalRecall;
                        return recallAverage;
                }
        }
}