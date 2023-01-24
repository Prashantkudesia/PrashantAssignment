@F3_Add_to_Cart
Feature: Add to cart
  I want to use this template for my feature file

  @tag1
  Scenario: To validate that user should able to add any product to cart
    Given User in on the home page
    When user click on search bar
    And user give some product name
    Then user choose the product and add to the cart
    
    @tag2
  Scenario Outline: To validate that user should able to buy product directly without adding in cart
    Given User in on the home page
    When user click on search bar
    And user give some product name
    Then user choose the product and click buy now for direct purchasing