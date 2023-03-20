Feature: Home Page Test

  Scenario: Open invalid URL
    When Admin open browser and wrong url
    Then The site cant be reached

  Scenario: Open valid URL
    When Admin open right url
    Then Admin go to login page

  Scenario: Admin empty login into web HRM
    When Admin enter valid username
    And Admin enter no password
    And Admin click button login
    Then Admin get message required

  Scenario: Admin invalid login into web HRM
    And Admin enter invalid username
    And Admin enter invalid password
    And Admin click button login
    Then Admin get message invalid credentials

  Scenario: Admin successful login into web HRM
    When Admin enter valid username
    And Admin enter valid password
    And Admin click button login
    Then Admin go to page Dashboard
