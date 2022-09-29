package com.kodilla.bank.homework;

;

public class Bank {
        private String name;
        private CashMachine pko;
        private CashMachine santander;
        private CashMachine nbp;
        private CashMachine alior;

        public Bank(String name){
                this.name = name;
                this.pko = new CashMachine("PKO",0);
                this.santander = new CashMachine("SANTANDER",0);
                this.nbp = new CashMachine("NBP",0);
                this.alior = new CashMachine("ALIOR",0);
}


              public void addPkoPayment(int money) {
                if (money > 0) { this.pko.addTransaction(money);
}
}

        public void addSantanderPayment(int money) {
                if (money > 0) {
                        this.santander.addTransaction(money);
                }
        }

        public void addNbpPayment(int money) {
                if (money > 0) {
                        this.pko.addTransaction(money);
                }
        }
        public void addAliorPayment(int money){
        if (money >0 ){this.alior.addTransaction(money);}
}

