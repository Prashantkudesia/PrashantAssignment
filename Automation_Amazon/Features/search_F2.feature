@F2_Search
Feature: Search
  I want to use this template for my feature file

  @tag1
  Scenario: To validate that user should search for a product
    Given User in on the home page
    When user click on search bar
    And user give some product name
    Then results will come up on the screen
   

  @tag2
  Scenario Outline: To validate that user should get error for wrong product search
    Given User in on the home page
    When user enter wrong product name
    Then user should get error message

