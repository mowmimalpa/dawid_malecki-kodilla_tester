package fizbuzzchecker;

import fizbuzzChecker.FizzBuzzChecker;
import io.cucumber.java8.En;
import org.junit.Assert;

public class fizzBuzzGame implements En {

    private int number;
    private String result;

    public fizzBuzzGame() {
        Given("THe number <Input>", (Integer int1) -> {
            this.number = int1;
        });
        When("Fizzbuzz is calculated", () -> {
            FizzBuzzChecker fizzBuzzChecker = new FizzBuzzChecker();
            this.result = fizzBuzzChecker.checkIfFizzBuzz(this.number);
        });

        Then("Output is <Output>", (String string) -> {
            Assert.assertEquals(string, this.result);

        });
    }

}
