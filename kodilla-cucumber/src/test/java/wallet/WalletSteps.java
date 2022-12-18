package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();

    public WalletSteps() {
        {
            Given("I have deposited $200 in my wallet", () -> {
                wallet.deposit(200);
                Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
            });
            When("I request $30", () -> {
                Cashier cashier = new Cashier(cashSlot);
                cashier.withdraw(wallet, 30);
            });
            Then("$30 should be dispensed", () -> Assert.assertEquals(30, cashSlot.getContents()));
            Then("The balance should be $170",
                    () -> Assert.assertEquals("Incorrect wallet balance", 170, wallet.getBalance()));


            Given("I have deposited $1000 in my wallet", () -> {
                wallet.deposit(100);
                Assert.assertEquals("Incorrect wallet balance", 100, wallet.getBalance());
            });
            When("I request $1000", () -> {
                Cashier cashier = new Cashier(cashSlot);
                cashier.withdraw(wallet, 100);
            });
            Then("$1000 should be dispensed", () -> Assert.assertEquals(100, cashSlot.getContents()));
            Then("The balance should be $0", () ->
                    Assert.assertEquals("Incorrect wallet balance", 0, wallet.getBalance()));

            Given("There should be $100 in my wallet", () -> {
                wallet.deposit(100);
                Assert.assertEquals("Incorrect wallet balance", 100, wallet.getBalance());
            });
            When("I want to withdraw $150", () -> {
                Cashier cashier = new Cashier(cashSlot);
                cashier.withdraw(wallet, 150);
            });
            Then("Can't pay", () -> {
                Assert.assertEquals(100, wallet.getBalance());
            });
            Then("Get information about insufficient amount in your wallet", () -> {
                Assert.assertEquals("You don't have enough money in your wallet", "You don't have enough money in your wallet");
            });

            Given("I have $50 in my wallet", () -> {
                wallet.deposit(50);
                Assert.assertEquals("Incorrect wallet balance", 50, wallet.getBalance());
            });
            When("I check the balance", () -> {
                Cashier cashier = new Cashier(cashSlot);
                cashier.withdraw(wallet, 0);
            });
            Then("The balance of my wallet is $100", () -> Assert.assertEquals(50, wallet.getBalance()));

        }
    }}