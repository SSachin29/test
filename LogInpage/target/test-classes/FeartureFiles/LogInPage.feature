Feature: log in functionality

  Scenario: Log in automation exercise page
    Given User on LogIn page of webside
    When user enters Username and Password 
    And User clicks on Submit button
    Then User will be on HomePage
