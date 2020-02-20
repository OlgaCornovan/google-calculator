@debug

  Feature: Verifying Login

    Scenario: Verifying Login with invalid email
      Given I navigate to ae website
      And I click login button
#      And I click login amazon button
#      Then I get result "Sign in with Amazon"
      And I fill in with my invalid email "olgatemciuc@yahoo.ru"
      And I fill in with my valid password "Olga123!"
      Then I click on LogIn button2
      Then I verify error message "Invalid login or password."
