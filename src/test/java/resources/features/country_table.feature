Feature: 3schools table verification

  Scenario: Verify Country of Ernst Handel
    Given User opens "chrome" browser "https://www.w3schools.com/html/html_tables.asp"
    Then The country for the company "Ernst Handel" should be "Austria"