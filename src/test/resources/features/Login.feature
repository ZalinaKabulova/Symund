Feature: Symund app login feature
  User Story:
  As a user, I should be able to login.

  Background:
    Given The user is on the login page

  Scenario: User can login with valid credentials
  clicking on Log in button
    When The user logs in
    And The user clicks on Log in button
    Then The user is on the dashboard page

  Scenario: User can login with valid credentials
  pushing ENTER
    When The user logs in
    And The user pushes ENTER
    Then The user is on the dashboard page


  Scenario: User cannot login with any invalid credentials
    When The user enters invalid username and password
    Then Wrong username or password should be displayed for invalid credentials


  Scenario: User cannot login with any invalid credentials
    When The user types only the username
    Then Please fill out this field message should be displayed

  @smoke
  Scenario: User cannot login with any invalid credentials
    When The user types only password
    Then Please fill out this field (usernameField) message should be displayed


  Scenario: User can see the password in form of dots by default
    When When the user types password
    Then The user see the password in form of dots by default


  Scenario: User can see the password explicitly if needed
    When When the user types password
    Then The user see the password explicitly

