Feature: Block users from withdrawing more than what they have
  Scenario: The user himself pays more than he has on the account
    Given There should be $100 in my wallet
    When I want to withdraw $150
    Then Can't pay
    And Get information about insufficient amount in your wallet