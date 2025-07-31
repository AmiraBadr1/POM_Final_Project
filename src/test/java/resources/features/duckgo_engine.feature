Feature: 1 : 5 DuckDuckGo search

  Scenario: Verify that DuckDuckGo page title is "google"
    Given User opens "chrome" browser "https://duckduckgo.com/"
    Then the page title should be "Google"

  Scenario: Verify that DuckDuckGo logo is displayed
    Given User opens "chrome" browser "https://duckduckgo.com/"
    Then DuckDuckGo logo should be visible

  Scenario: Verify that first search result link is the Selenium WebDriver documentation
    Given User opens "chrome" browser "https://duckduckgo.com/"
    When User searches for "Selenium WebDriver"
    Then The first result link should be "https://www.selenium.dev/documentation/webdriver/"

  Scenario: Verify that the fourth result of TestNG search is 'TestNG Tutorial'
    Given User opens "firefox" browser "https://duckduckgo.com/"
    When User searches for "TestNG"
    Then The text of the fourth result should be "TestNG Tutorial"

  Scenario: Verify that second result on second page contains LinkedIn link
    Given User opens "chrome" browser "https://duckduckgo.com/"
    When User searches for "Cucumber IO"
    And User goes to the second page of results
    Then the page link should be "https://www.linkedin.com"


