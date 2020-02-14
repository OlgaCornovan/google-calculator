

Feature: Minus Operator

  Background: Google Calculator Page
    Given I navigate to google calculator

#   Happy Path Testing Strategy
  Scenario: Test difference of 2 positive digits with 1 and 2 numbers
    And I click "67"
    And I click "minus"
    And I click "5"
    Then I get result "62"

  Scenario: Test difference of 3 positive digits with 1, 2 and 3 numbers
    And I click "455"
    And I click "minus"
    And I click "25"
    And I click "minus"
    And I click "30"
    Then I get result "400"

  Scenario: Test difference of 2 negative digits
    And I click "-10"
    And I click "minus"
    And I click "33"
    Then I get result "-43"

  Scenario: Test difference of 2 negative and 2 positive digits with 1, 2, 3 and 4 numbers
    And I click "-100"
    And I click "minus"
    And I click "20"
    And I click "minus"
    And I click "-10"
    And I click "minus"
    And I click "1000"
    Then I get result "-1130"

  Scenario: Test difference of 2 double digits
    And I click "0.10"
    And I click "minus"
    And I click "50.17"
    Then I get result "-50.07"

  Scenario: Test difference of 3 different double digits
    And I click "-0.30"
    And I click "minus"
    And I click "50.18"
    And I click "minus"
    And I click "600.99"
    Then I get result "-651.47"

#   Negative Testing Strategy
  Scenario: Test Error handling, difference of unexpected characters
    And I click "."
    And I click "minus"
    And I click "33"
    And I click "minus"
    And I click "."
    Then I get result "Error"

  Scenario: Test Error handling, difference of unexpected characters
    And I click "-753"
    And I click "minus"
    And I click "33"
    And I click "minus"
    And I click "."
    And I click "minus"
    And I click "-77898"
    Then I get result "Error"

#  Boundary Testing Strategy
  Scenario: Test difference of 3 long numbers
    And I click "-99999999999999999999"
    And I click "minus"
    And I click "88888888888888888888"
    And I click "minus"
    And I click "11111111111111111111"
    Then I get result "-2e+20"

  Scenario: Test sum of 3 double digits
    And I click "-999.99999999999999999"
    And I click "minus"
    And I click "8888888888.8888888888"
    And I click "minus"
    And I click "1.1111111111111111111"
    Then I get result "-8888889890"

