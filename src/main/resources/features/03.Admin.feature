Feature: Admin Menu Test

  Scenario: Admin go to Admin/User Management page
    When Admin click menu Admin
    Then Admin go to page Admin User Management

  Scenario: Admin add System Users
    When Admin click button Add
    And Admin click button User Role
    And Admin fill Employee Name
    And Admin click button Status
    And Admin fill Username add user
    And Admin fill Password and Confirm Password add user
    Then Admin click button Save add user

  Scenario: Admin add Job Title
    When Admin click button Job and click Job Titles
    And Admin click button Add
    And Admin fill Job Title
    And Admin write Job Description
    And Admin write job Note
    Then Admin click button Save job