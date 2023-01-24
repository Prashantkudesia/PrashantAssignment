@F1_Login
Feature: Login for Website
  I want to use this template for my feature file


  Scenario: To validate that user should login with correct credentials
    Given User in on the home page
    When user enter username
    And user enters password
    And user clicks on login button
    Then user logged in successfully
    
    Scenario: To validate that user should not login with Incorrect credentials
    Given User in on the home page
    When user enter wrong username
    Then user is shown a error message

