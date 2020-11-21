Feature:Test Inventery menu
  Background:


    Given  User is on sauceDemo page
    And User Logs with "standard_user" and "secret_sauce"
    Then user should land on the invontory page

  Scenario:Test navigation menu
  #And navigation menu should be visible
  Then user should see open menu
    And user can see menu options
   Then user navigate to "All Items"
    Then all prodect should be available


  Scenario:Test sorting products
  And sort by "Price (low to high)"
    And the the first law price product name"Sauce Labs Onesie" displayed

  Scenario:Add item to cart
    And user can navigate to "Sauce Labs Backpackt"items
    Then Item information is displayed

