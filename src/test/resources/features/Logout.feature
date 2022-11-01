Feature: Symund app logout feature
  User Story:
  As a user, I should be able to logout.


  Background:
    Given The user is on the login page
    Given The user logs in
    Given The user pushes ENTER

    @smoke
    Scenario: User can log out and ends up in login page
      When The user is on the dashboard page
      Then The user clicks on Log out button
