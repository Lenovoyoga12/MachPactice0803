Feature: As a user wants to go to iceland webpage and check login functionality

  Scenario:Go to iceland webpage and check username and password and verify it
    Given user is on iceland webpage
    When user click on sign in  button
    And user enter invalid username "<username>" and password"<password>"
    And user click on sign in securly button
    Then user must not be  able to login and verify it


