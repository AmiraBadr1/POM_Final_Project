Feature: herokuapp Check Box

  Scenario: Verify that both checkboxes are checked
    Given User opens "chrome" browser "http://the-internet.herokuapp.com/checkboxes"
    When User checks the first checkbox if not already checked
    Then Both checkboxes should be checked