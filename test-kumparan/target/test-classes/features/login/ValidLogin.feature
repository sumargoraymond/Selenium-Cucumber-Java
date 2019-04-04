@functionalTest
Feature: This feature checks login functionalities

  Scenario: Login by valid Google login
    Given I go to Kumparan
    Then I should see correct title page for Kumparan
    And I click on login Google button
    And I login to Google with valid credential
    Then I should be logged in to Kumparan

    Scenario: Login by valid Facebook login
      Given I go to Kumparan
      Then I should see correct title page for Kumparan
      And I click on login Facebook button
      And I login to Facebook with valid credential
      Then I should be logged in to Kumparan