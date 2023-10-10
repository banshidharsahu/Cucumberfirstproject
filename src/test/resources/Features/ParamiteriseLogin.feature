Feature: feature to test google search functionality

  Scenario Outline: Login application with data
    Given brower got open
    And User open login page
    When User entered <username> and <password>
    And click on login button
    Then user navigate to home page

    Examples: 
      | username | password    |
      | student  | Password123 |
      | student  | Password123 |
