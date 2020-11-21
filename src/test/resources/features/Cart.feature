Feature: in order to add to cart


  Background:
    Given  User is on sauceDemo page
    And User Logs with "standard_user" and "secret_sauce"
    Then user should land on the invontory page
    And user can navigate to "Sauce Labs Backpack"items
    Then Item information is displayed
   Then user can add item to cart
    And one item desplayed on cart
    Then user can click on cart
    And the item information displayed on cart


   Scenario: The user should be able to ckeckout
     And user can navigate to check out button
     And User able to click checkout button
    Then User land to checkout-step-one page



  Scenario:Continue Shopping
    Then verify that user can Continue Shopping
    Then user should land on the invontory page

   Scenario:navigate to cart
     Then User can remove item in cart
     And user navigate back to cart page

