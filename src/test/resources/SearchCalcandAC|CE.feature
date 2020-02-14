@debug

Feature: Search Google Calculator

  Scenario: Google search calculator
    Given I navigate to google site
    And I type word "calculator"
    And I click google search button
    Then I should see google calculator

  Scenario: Test CE button
    Given I navigate to google calculator
    And I click "2"
    And I click "multiply"
    And I click "30"
    And I click "clear entry"
    Then I see result "0"

  Scenario: Test AC button
    Given I navigate to google calculator
    And I click "2"
    And I click "multiply"
    And I click "30"
    Then I get result "60"
    And I click "all clear"
    Then I see result "0"