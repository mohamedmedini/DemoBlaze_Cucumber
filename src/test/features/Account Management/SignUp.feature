@DemoBlaze_SignUp
Feature: DemoBlaze account connexion
  As a user i want to login to DemoBlaze

  @DemoBlaze_AccountConnexion
  Scenario: connect to DemoBlaze
    Given i put the URL "https://www.demoblaze.com/index.html"
    When i click to signup button
    And i put the username "YtestYtest"
    And i put the password "testtest24"
    And i click signup
    Then i verify that the new account is created successfully with the message "Sign up successful."