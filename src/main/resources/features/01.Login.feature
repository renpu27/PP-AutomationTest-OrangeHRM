Feature: Home Page Test

  Scenario: Admin empty login into web HRM
    Given Admin open browser and url
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
