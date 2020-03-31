@debug

  Feature: Verifying Login

    Background: Navigate A&E watches and click login btn
      Given I navigate to ae website
      And I click login button

    Scenario: Verifying Login with invalid email
#      Given I navigate to ae website
#      And I click login button
#      And I click login amazon button
#      Then I get result "Sign in with Amazon"
      And I fill in with my email "olgatemciuc@yahoo.ru"
      And I fill in with my password "Olga123!"
      Then I click on LogIn button2
      Then I verify error message "Invalid login or password."

      Scenario: Verifying Logged In user can add item PR8 to the cart
#        Given I navigate to ae website
#        And I click login button
        And I fill in with my email "olgatemciuc@yahoo.com"
        And I fill in with my password "60rnov@n"
        And I click on LogIn button2
        Then I enter search window "PR801"
        And I click ae search button
        Then I verify the "Rolex Day-Date President 80's Model 18038" item is displayed
        And I click on add to cart button
        And I click on go to shopping cart
        Then I verify that I have one item in the cart






