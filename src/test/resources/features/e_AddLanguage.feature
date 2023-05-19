Feature: Adding the language in HRMS Application

  @last
  Scenario:
    When user enters valid admin credentials
    And user clicks on login button
    Then admin user is successfully logged in
    When user clicks on Admin option
    And user clicks on Qualifications option
    And user clicks on Languages option
    And user clicks on Add button
    And user enters languageName
    And user clicks on saveLanguage button
    Then language added successfully