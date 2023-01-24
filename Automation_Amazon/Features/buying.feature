@F5_Buying
Feature: Buying product
  I want to use this template for my feature file

  @tag1
  Scenario: To validate that user should buy a product from his cart
     Given User in on the home page
    When user click on search bar
    And user give some product name
    And user add product
    Then user is able to do checkout