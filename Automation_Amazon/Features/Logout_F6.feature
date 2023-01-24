@F6_Logout
Feature: Logout
  I want to use this template for my feature file

Scenario: To validate that user should logout
    Given User in on the home page
    When user enter username
    And user enters password
    And user clicks on login button
    Then user logged in successfully and user should able to logout from website
