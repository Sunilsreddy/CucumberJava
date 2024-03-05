Feature: Feature to test login functionality using Hooks

  Scenario: Check login is success with valid credentials
    Given user is on signin page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page
