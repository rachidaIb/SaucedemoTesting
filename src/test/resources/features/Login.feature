Feature:Test login functionalty
  Scenario:The user should be able to login
    Given  User is on sauceDemo page
    And User Logs with "standard_user" and "secret_sauce"
    Then user should land on the invontory page
  And user can add two item to cart

 Scenario Outline:Test all accepted users
    Given  User is on sauceDemo page
    And User Logs with "<user>" and "<pass>"
    Then user should land on the invontory page
   Examples:

     | user | pass |
     | standard_user | secret_sauce |
     | problem_user| secret_sauce|
     |performance_glitch_user | secret_sauce |


  Scenario:The user should not able to login
    Given  User is on sauceDemo page
    And User Logs with "locked_out_user" and "secret_sauce"
    Then user should see the error button