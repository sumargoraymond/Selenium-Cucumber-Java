@functionalTest
Feature: This feature checks comment functionalities

  Scenario: Comment without login
    Given I go to URL "https://kumparan.com/banjarhits/sambut-hangat-jokowi-tkn-terima-kasih-warga-kalsel-1553733533138322994"
    And I comment on article "Mantap, keren juga artikelnya!"
    Then I should not be able to comment and shown login options

  Scenario: Comment by valid Google login
    Given I go to Kumparan
    And I click on login Google button
    And I login to Google with valid credential
    Then I should be logged in to Kumparan
    And I go to URL "https://kumparan.com/banjarhits/sambut-hangat-jokowi-tkn-terima-kasih-warga-kalsel-1553733533138322994"
    And I comment on article "Mantap, keren juga artikelnya!"
    Then I should be able to see my comment on article "Mantap, keren juga artikelnya!"

  Scenario: Comment by valid Facebook login
    Given I go to Kumparan
    And I click on login Facebook button
    And I login to Facebook with valid credential
    Then I should be logged in to Kumparan
    And I go to URL "https://kumparan.com/banjarhits/sambut-hangat-jokowi-tkn-terima-kasih-warga-kalsel-1553733533138322994"
    And I comment on article "Mantap, keren juga artikelnya!"
    Then I should be able to see my comment on article "Mantap, keren juga artikelnya!"


