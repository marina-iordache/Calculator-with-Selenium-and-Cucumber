Feature: Calculator that perform basic operations

  Scenario: Adding two numbers
  Given I have a calculator
  When I add 1 and 2
  Then I should get 3

  Scenario: Multiplying two numbers
  Given I have a calculator
  When I multiply 3 and 4
  Then  I should get 12

