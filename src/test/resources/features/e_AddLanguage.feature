Feature: Adding the language in HRMS Application

  Background:
    When user enters valid admin credentials
    And user clicks on login button
    Then admin user is successfully logged in
    When user clicks on Admin option
    And user clicks on Qualifications option
    And user clicks on Languages option
    And user clicks on Add button

  @language
  Scenario: Adding one language from steps file
    And user enters languageName
    And user clicks on saveLanguage button
    Then language added successfully

  @language
    Scenario: Adding one language from feature file
      And user enters "Miamian"
      And user clicks on saveLanguage button
      Then language added successfully


      @language
       Scenario Outline: : Adding multiple languages from feature file
        And user provides "<languageName>"
        And user clicks on saveLanguage button
        Then language added successfully
        Examples:
        |languageName|
        |green|
        |blue |
        |red  |
        |pink |

        @language
        Scenario: Adding multiple languages using data table
          And user provides multiple languages data and verify they are added
            |languageName|
            |green!|
            |blue! |
            |red!  |
            |pink! |
