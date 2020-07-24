@Input_Forms
Feature: All Scenario related from Input form Tag

  #Author : Vineet_Pandey
  Scenario: 01 Test Simple Form Demo page - TextBox testing.
    Given I launch and login to the application
    And I click on tab Input Forms
    Then I click on subtab Simple From Demo
    Then I verify Simple From Demo page

  Scenario: 02 Test CheckBox Demo Page
    Given I launch and login to the application
    And I click on tab Input Forms
    Then I click on subtab Checkbox From Demo
    Then I verify Checkbox Demo page

  Scenario: 03 Test Radio buttons Demo Page
    Given I launch and login to the application
    And I click on tab Input Forms
    When I click on subtab Radio Buttons Demo
    Then I verify Radio Buttons Demo Page is opened successfully

  Scenario: 04 Test Select dropdown List Page
    Given I launch and login to the application
    And I click on tab Input Forms
    Then I click on subtab Select dropdown List
    Then I verify Select dropdown List

  Scenario: 05 Test Input From Submit Page
    Given I launch and login to the application
    And I click on tab Input Forms
    Then I click on subtab Inout Form Submit
    Then I verify Input From Submit Page

  Scenario: 06 Test Ajex Form Submit Page
    Given I launch and login to the application
    And I click on tab Input Forms
    Then I click on subtab Ajex Form Submit
    Then I verify Ajex Form Submit Page

  Scenario: 07 Test JQuary Select dropdown Page
    Given I launch and login to the application
    And I click on tab Input Forms
    Then I click on subtab JQuary Select dropdown
    Then I verify JQuary Select dropdown Page
