Feature: Google Search Action

  Scenario: Successful Google Search
    Given Open Google Website
    When Enter search keyword
    Then Submit the search keyword
    And Quit the browser
