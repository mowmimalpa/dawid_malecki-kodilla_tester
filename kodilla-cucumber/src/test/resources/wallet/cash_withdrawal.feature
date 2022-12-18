Feature Cash Withdrawal
  Scenario Successful withdrawal fromy a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed