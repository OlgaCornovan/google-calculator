

Feature: Plus Operator

  Background: Google Calculator Page
    Given I navigate to google calculator

#   Happy Path Testing Strategy
  Scenario: Test sum of 2 positive digits with 1 and 2 numbers
    And I click "2"
    And I click "plus"
    And I click "30"
    Then I get result "32"

  Scenario: Test sum of 3 positive digits with 1, 2 and 3 numbers
    And I click "7"
    And I click "plus"
    And I click "23"
    And I click "plus"
    And I click "370"
    Then I get result "400"

  Scenario: Test sum of 2 negative digits
    And I click "-10"
    And I click "plus"
    And I click "-33"
    Then I get result "-43"

  Scenario: Test sum of 2 negative and 2 positive digits with 1, 2, 3 and 4 numbers
    And I click "-100"
    And I click "plus"
    And I click "-20"
    And I click "plus"
    And I click "10"
    And I click "plus"
    And I click "1000"
    Then I get result "890"

  Scenario: Test sum of 2 double digits
    And I click "0.10"
    And I click "plus"
    And I click "50.17"
    Then I get result "50.27"

  Scenario: Test sum of 3 different double digits
    And I click "-0.10"
    And I click "plus"
    And I click "-50.18"
    And I click "plus"
    And I click "600.99"
    Then I get result "550.71"

# Happy Path combination of operators
  Scenario: Test plus with another operators
    And I click "0.90"
    And I click "plus"
    And I click "20.10"
    And I click "multiply"
    And I click "2"
    And I click "divide"
    And I click "3"
    And I click "minus"
    And I click "11"
    Then I get result "3.3"

#   Negative Testing Strategy
  Scenario: Test Error handling, sum of unexpected characters
    And I click "."
    And I click "plus"
    And I click "33"
    And I click "plus"
    And I click "."
    Then I get result "Error"

  Scenario: Test Error handling, sum of unexpected characters
    And I click "-753"
    And I click "plus"
    And I click "33"
    And I click "plus"
    And I click "."
    And I click "plus"
    And I click "-77898"
    Then I get result "Error"

#  Boundary Testing Strategy
  Scenario: Test sum of 3 long positive numbers
    And I click "99999999999999999999"
    And I click "plus"
    And I click "88888888888888888888"
    And I click "plus"
    And I click "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111"
    Then I get result "1.1111111e+84"

  Scenario: Test sum of 3 long negative numbers
    And I click "-22222222222222222222"
    And I click "plus"
    And I click "-77777777777777777777"
    And I click "plus"
    And I click "-10000000000000000000"
    Then I get result "-1.1e+20"

  Scenario: Test sum of 3 double digits
    And I click "-999.99999999999999999"
    And I click "plus"
    And I click "8888888888.8888888888"
    And I click "plus"
    And I click "1.1111111111111111111"
    Then I get result "8888887890"

