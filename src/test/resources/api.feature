Feature: Login

Scenario: Login using valid email and password
  Given user is on login page
  And user input username with "standard_user"
  And user input password with "secret_sauce"
  When user click login button
  Then user is on homepage

  Scenario:
