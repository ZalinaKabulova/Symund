@SYMU-1663
Feature: Symund app login feature
  User Story:
  As a user, I should be able to login.

  Background:
    Given The user is on the login page

  @SYMU-1600
  Scenario: User can login with valid credentials
  clicking on Log in button
    When The user logs in
    And The user clicks on Log in button
    Then The user is on the dashboard page

  @SYMU-1601
  Scenario: User can login with valid credentials
  pushing ENTER
    When The user logs in
    And The user pushes ENTER
    Then The user is on the dashboard page

  @SYMU-1602
  Scenario: User cannot login with any invalid credentials
    When The user enters invalid username and password
    Then Wrong username or password should be displayed for invalid credentials

  @SYMU-1603
  Scenario: User cannot login with any invalid credentials
    When The user types only the username
    Then Please fill out this field message should be displayed

  @SYMU-1655
  Scenario: User cannot login with any invalid credentials
    When The user types only password
    Then Please fill out this field (usernameField) message should be displayed

  @SYMU-1604
  Scenario: User can see the password in form of dots by default
    When When the user types password
    Then The user see the password in form of dots by default

  @SYMU-1654
  Scenario: User can see the password explicitly if needed
    When When the user types password
    Then The user see the password explicitly

  @SYMU-1656
  Scenario: User can see the "Forgot password?" link on the login page and
  can see the "Reset password" button on the next page after clicking on forget password link
    When The user see Forgot password
    And The user clicks on Forgot passwort field
    Then The user see Reset password field on the next page

  @SYMU-1657
  Scenario: User can see valid placeholders on Username and Password fields
    Then The user see placeholders on Username and Password fields


