Feature: Check home page functionality

 Background: user is logged in
    Given user is on login page
    When user enters username and password
    Then user is navigated to the home page

  Scenario: check logout link
    When user clicks on welcome link
    Then logout link is displayed

  Scenario: verify quick launch toolbar is present
    When user clicks on dashboard link
    Then quick launch toolbar is displayed
