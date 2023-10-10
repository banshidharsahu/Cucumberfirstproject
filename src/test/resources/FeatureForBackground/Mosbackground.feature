Feature: Need to test two senario realted to MOS application in Oracle

  Background: login for every Scenario
    Given user in login link page and click on login link
    When user enter user id and password
    And click on login button
    Then user navigate to home page

  Scenario: This is for login MOS and signout in home page
    Given user is on home page
    When user click on sign out link

  Scenario: This is 2nd scenario user login MOS and go to dashbord and and check SR
    Given user in home page
    When click on Hashbord tab
    Then User Navigate to Active SR page and click
