

Feature: Divide Operator

  Background: Google Calculator Page
    Given I navigate to google calculator

#   Happy Path Testing Strategy
  Scenario: Test divide of 2 positive digits with 1 and 2 numbers
    And I click "30"
    And I click "divide"
    And I click "2"
    Then I get result "15"

  Scenario: Test divide of 3 positive digits with 1, 2 and 3 numbers
    And I click "370"
    And I click "divide"
    And I click "23"
    And I click "divide"
    And I click "7"
    Then I get result "2.29813664596"

  Scenario: Test divide of 2 negative digits
    And I click "-10"
    And I click "divide"
    And I click "-33"
    Then I get result "0.30303030303"

  Scenario: Test divide of 2 negative and 2 positive digits with 1, 2, 3 and 4 numbers
    And I click "-100"
    And I click "divide"
    And I click "-20"
    And I click "divide"
    And I click "8"
    And I click "divide"
    And I click "1000"
    Then I get result "0.000625"

  Scenario: Test divide of 2 double digits
    And I click "0.10"
    And I click "divide"
    And I click "50.17"
    Then I get result "0.00199322304"

  Scenario: Test divide of 3 different double digits
    And I click "-0.10"
    And I click "divide"
    And I click "-50.18"
    And I click "divide"
    And I click "600.99"
    Then I get result "0.0000033159"

#   Negative Testing Strategy
  Scenario: Test Error handling, divide of unexpected characters
    And I click "."
    And I click "divide"
    And I click "33"
    And I click "divide"
    And I click "."
    Then I get result "Error"

  Scenario: Test Error handling, divide of unexpected characters
    And I click "-753"
    And I click "divide"
    And I click "33"
    And I click "divide"
    And I click "."
    And I click "divide"
    And I click "-77898"
    Then I get result "Error"

#  Boundary Testing Strategy
  Scenario: Test divide of 3 long positive numbers
    And I click "99999999999999999999"
    And I click "divide"
    And I click "88888888888888888888"
    And I click "divide"
    And I click "11111111111111111111"
    Then I get result "1.0125e-19"

  Scenario: Test divide of 3 long negative numbers
    And I click "-22222222222222222222"
    And I click "divide"
    And I click "-77777777777777777777"
    And I click "divide"
    And I click "-10000000000000000000"
    Then I get result "-2.8571429e-20"

  Scenario: Test divide of 3 double digits
    And I click "-999.99999999999999999"
    And I click "divide"
    And I click "8888888888.8888888888"
    And I click "divide"
    And I click "1.1111111111111111111"
    Then I get result "-1.0125e-7"

