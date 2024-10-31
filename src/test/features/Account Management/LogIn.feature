@DemoBlaze_LogIn
Feature: DemoBlaze account creation
  As a user i want to signup to DemoBlaze

  @DemoBlaze_AccountCreation
  Scenario: connect to OrangeHRM
    Given i enter the URL "https://www.demoblaze.com/index.html"
    When i click to login button
    And i enter the username "YtestYtest"
    And i enter the password "testtest24"
    And i click login
    Then i verify that i connected successfully to my account with the message "Welcome YtestYtest"

