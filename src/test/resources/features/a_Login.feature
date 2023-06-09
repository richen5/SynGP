Feature: Validation of login scenarios

  Background:
    #Given user is navigated to HRMS application

  @login @report @sprint12
  Scenario: Admin login
    #Given user is navigated to HRMS application
    When user enters valid admin credentials
    And user clicks on login button
    Then admin user is successfully logged in

  @regression @login
  Scenario: ESS login
   # Given user is navigated to HRMS application
    When user enters valid ess username and password
    And user clicks on login button
    Then ess user is successfully logged in

  @regression  @login
  Scenario: Invalid login
   # Given user is navigated to HRMS application
    When user enters invalid username and password
    And user clicks on login button
    Then user see error message on the screen
