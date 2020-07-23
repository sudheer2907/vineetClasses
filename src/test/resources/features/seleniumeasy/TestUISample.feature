@UITestsample
Feature: This is sample UI test.

  Scenario: Test Simple Form Demo page - TextBox testing.
    Given I launch and login to the application
    And I click on tab Input Forms
    Then I click on subtab Simple From Demo
    Then I verify Simple From Demo page

  Scenario: Test CheckBox Demo Page
    Given I launch and login to the application
    And I click on tab Input Forms
    Then I click on subtab Checkbox From Demo
    Then I verify Checkbox Demo page

  Scenario: Test Radio Buttons Demo Page
    Given I launch and login to the application
    And I click on tab Input Forms
    Then I click on subtab Radio Buttons Demo
    Then I verify Buttons Demo Page

  Scenario: Test Select dropdown List Page
    Given I launch and login to the application
    And I click on tab Input Forms
    Then I click on subtab Select dropdown List
    Then I verify Select dropdown List

  Scenario: Test Input From Submit Page
    Given I launch and login to the application
    And I click on tab Input Forms
    Then I click on subtab Inout Form Submit
    Then I verify Input From Submit Page

  Scenario: Test Ajex Form Submit Page
    Given I launch and login to the application
    And I click on tab Input Forms
    Then I click on subtab Ajex Form Submit
    Then I verify Ajex Form Submit Page

  Scenario: Test JQuary Select dropdown Page
    Given I launch and login to the application
    And I click on tab Input Forms
    Then I click on subtab JQuary Select dropdown
    Then I verify JQuary Select dropdown Page
