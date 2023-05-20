Feature: Create bot for gonki website

  @gonki
  Scenario: starting the game and writing text on website
    When on website clicks on fastStart button
    And  clicks on random text option
    Then waiting for green light to race start
    And starting type the lighting words in cycle
    Then finishing the game with expected result


