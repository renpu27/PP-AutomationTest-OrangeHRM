Feature: Recruitment HRM
  Scenario: Admin go to Recruitment page
    When Admin click menu Recruitment
    Then Admin go to page Recruitment

  Scenario: Admin add candidate
    When Admin click button Add
    And Admin fill candidate Name
    And Admin choose Vacancy
    And Admin fill Email address and Contact number
    And Admin upload Resume
    And Admin write Keywords
    And Admin set Date
    And Admin write Notes
    And Admin click Consent to keep data
    Then Admin click button Save candidate

  Scenario: Admin add vacancies
    When Admin click button Vacancies
    And Admin click button Add
    And Admin fill Vacancy Name
    And Admin choose Job Title
    And Admin write Description
    And Admin fill Hiring Manager
    And Admin fill Number of Positions
    And Admin click button Active
    And Admin click button Publish in RSS and Web Page
    Then Admin click button Save vacancies
