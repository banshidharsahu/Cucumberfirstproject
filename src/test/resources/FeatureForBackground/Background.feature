Feature: application login and some home pacge functionality need to check

  Background: For common login
    Given user is on login page
    When provide user id and password
    And click on login button
    Then user navigated to home page

  Scenario: This first Scenario 
    When user click on wesly tester
    Then validate Logout link is there

  Scenario: This 2nd scenario
    When user click on Admin tab
    Then validate Reset button is there or not
