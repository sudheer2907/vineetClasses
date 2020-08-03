@SelectDroupDown
Feature: Test DroupDown List Page

  Scenario: 04 Test Select dropdown List Page
    Given I launch and login to the application
    And I click on tab Input Forms
    Then I click on subtab Select dropdown List
    Then I verify Select dropdown List Page is opened

  Scenario: Verify Select List Demo Section
    Given I launch and login to the application
    And I click on tab Input Forms
    And I click on subtab Select dropdown List
    And I selected select Friday
    Then I verify Friday is selected

  Scenario: Verify Multi Select List  Demo Sectio
    Given I launch and login to the application
    And I click on tab Input Forms
    And I click on subtab Select dropdown List
    And I selected Florida and New York
    Then Verify Florida and New York is selected
