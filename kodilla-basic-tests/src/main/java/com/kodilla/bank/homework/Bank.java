package com.kodilla.bank.homework;

;

public class Bank {
        private String[] name;
        private CashMachine pko;
        private CashMachine santander;




        public Bank() {
                this.name = new String[0];
                this.pko = new CashMachine();
                this.santander = new CashMachine();


        }


// Czy to poniżej dobrze?
        public void addPkoPayment(int money) {
                if (money > 0) {
                        this.pko.addTransaction(money);
                }
        }

        public void addSantanderPayment(int money) {
                if (money > 0) {
                        this.santander.addTransaction(money);
                }
        }

        public double getPkoAverage() {
                return this.pko.getAverage();

        }

        public double getSantanderAverage() {
                return this.santander.getAverage();
        }


}
