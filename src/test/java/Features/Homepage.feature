
Feature: YouTube ka log in 




  Scenario: Play song on youtube and validate
  
    Given Chrome browser will be loaded
    When Open youtube and search "Kaho na Kaho"
    And play the song with full screen and volume
    Then song will play will full volume and takeScreenshot
    


