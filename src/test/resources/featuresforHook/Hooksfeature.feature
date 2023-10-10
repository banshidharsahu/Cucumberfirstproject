Feature: Application login functionality checking

  Scenario: Application login process verify
    Given user on login page
    When provide userid and password in text field
    And click on Login button
    Then user navigated to homepage successfully
