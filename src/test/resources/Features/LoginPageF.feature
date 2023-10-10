Feature: feature to test login page functionality by using page factory

  Scenario Outline: Login the application with data by page factory consept
    Given brower got opened
    And User going to open login page
    When User enter <userid> and <password>
    And click on submit button
    Then user should navigate to home page

    Examples: 
      | userid  | password    |
      | student | Password123 |
      | student | Password123 |
