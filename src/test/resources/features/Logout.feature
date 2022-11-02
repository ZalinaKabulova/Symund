@SYMU-1670
Feature: Symund app logout feature
  User Story:
  As a user, I should be able to logout.


  Background:
    Given The user is already logged in

  @SYMU-1668
  Scenario: User can log out and ends up in login page
    When The user is already on the dashboard page
    And The user clicks on Log out button
    Then The user lands on log in page

  @SYMU-1669
  Scenario: User cannot go to home page again by clicking
  step back button after successfully logged out.
    When The user click on Log out Button
    Then The user lands on log in page
    And The user can not land on dashboard page again clicking Back button
