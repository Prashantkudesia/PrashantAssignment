@F4_Purchasing
Feature: Purchasing 

  @tag1
  Scenario: To validate user should able to view or change item in cart
    Given User in on the home page
    When user click on search bar
    And user give some product name
    And user add item in cart
    Then user visit the cart and view or change product quantity for purchasing

