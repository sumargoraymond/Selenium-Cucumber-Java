@functionalTest @negativeTest
Feature: This feature checks invalid login functionalities

  Scenario: Login by invalid Facebook login
    Given I go to Kumparan
    Then I should see correct title page for Kumparan
    And I click on login Facebook button
    And I login to Facebook with invalid credential
    Then I should not be logged in to Kumparan

  Scenario: Login by invalid Google login
    Given I go to Kumparan
    Then I should see correct title page for Kumparan
    And I click on login Google button
    And I login to Google with invalid credential
    Then I should not be logged in to Kumparan