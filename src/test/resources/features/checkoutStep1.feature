Feature: checkout

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
        And user can navigate to check out button
        And User able to click checkout button
        Then User land to checkout-step-one page

       Scenario: The user should be able to ckeckout with valid informations
         Then User insert  his first name "Rachida"
         And User insert  his last name "ibeghou"
            And user insert pstal code "19145"
         Then user navigate to continue button
         Then User land to checkout-step-two page

      Scenario: cancel item
        Then User can cancel his order
        And the item information displayed on cart