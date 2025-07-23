Feature: DuckDuckGo search tests

  Scenario: Verify that DuckDuckGo page title is "google"
    Given User opens chrome browser and navigates to DuckDuckGo
    Then the page title should be "Google"

  Scenario: Verify DuckDuckGo logo is displayed
    Given User opens chrome browser and navigates to DuckDuckGo
    Then DuckDuckGo logo should be displayed

  Scenario: Verify first search result link
    Given User opens chrome browser and navigates to DuckDuckGo
    When User searches for "Selenium WebDriver"
    Then The first result link should be "https://www.selenium.dev/documentation/webdriver/"
