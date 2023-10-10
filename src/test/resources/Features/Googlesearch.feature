Feature: feature to test google search functionality

  Scenario: Search google to findout data
    Given brower opened
    And User on Google search page
    When User entered text on serach box
    And hit enter
    Then user navigate to search result
