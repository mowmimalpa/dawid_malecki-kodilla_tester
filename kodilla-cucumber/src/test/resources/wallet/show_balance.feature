Feature Display balance
  Scenario Users checks the balance
    Given I have $100
    When I check the balance
    Then The balance is $100