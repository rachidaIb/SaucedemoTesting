Feature: in order to add to cart

  Background:

    Given  User is on sauceDemo page
    And User Logs with "standard_user" and "secret_sauce"
    Then user should land on the invontory page
    And user can navigate to "Sauce Labs Fleece Jacket"items
    Then Item information is displayed
    Then user can add item to cart
    And one item desplayed on cart


  Scenario:remove items
    And user can remove item in cart
    And  User can navigate back to invotory page

  Scenario: User can add to shopping cart
    Then user can click on cart

