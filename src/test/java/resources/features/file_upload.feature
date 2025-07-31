Feature: Upload file on a website

  Scenario: File Upload Test
    Given User opens "chrome" browser "http://the-internet.herokuapp.com/upload"
    When User uploads the file "C:\Users\Amira\Desktop\baby.jpg"
    Then The file should be uploaded successfully