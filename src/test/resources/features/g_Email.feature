@email
Feature: Work with email

  Background: mailUser navigated to valid application
    When mailUser enters valid credentials
    And  mailUser clicks on login button

  Scenario: login on website
    Then mailUser user is successfully logged in

    Scenario: create and sent email by myself
    When mailUser clicks on create email button
    And mailUser fill out the emailTo field
    And mailUser fill out the subjectEmail field
    And mailUser fill out the textEmail field
    And mailUser clicks on sendEmail button
    Then mailUser got emailSent confirmation

      Scenario: exit to start page
    When mailUser clicks on settings button
    And mailUser clicks on exit option
    And mailUser exit to start menu
    Then mailUser got emailExit confirmation