@smoke
Feature: Symund app login feature
  User Story:
  As a user, I should be able to login.

  Background:
    Given The user is on the login page

    Scenario: User can login with valid credentials
      When The user logs in
      And The user clicks on Log in button
      Then The user is on the dashboard page