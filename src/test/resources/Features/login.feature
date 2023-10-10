Feature: feature to test login functionality

  Scenario: Check login is successful with valid credencial
    Given user is on login page
    When user enter username and password
    And clicks on ligin button
    Then user is navigated to the home page
