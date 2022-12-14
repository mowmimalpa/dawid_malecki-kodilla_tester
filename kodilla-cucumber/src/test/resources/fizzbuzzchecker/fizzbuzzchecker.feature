

  Scenario Outline: Output  on what is the multiple of 3 and 5

    Given THe number <Input>

    When Fizzbuzz is calculated

    Then Output is <Output>
    Examples:
      | Input| Output |
      | 0      | "None"          |
      | 1      | "None"       |
      | 3      | Fizz       |
      | 5      | Buzz       |
      | 15     | FizzBuzz   |
