@JquerySelectDropDwon
Feature: Test Jquery Select DropDown Page

  Scenario: 01 Test JQuary Select dropdown Page
    Given I launch and login to the application
    And I click on tab Input Forms
    Then I click on subtab JQuary Select dropdown
    Then I verify JQuary Select dropdown Page is open Successfully

  Scenario: 02 Single Select - Search and Select country
    Given I launch and login to the application
    And I click on tab Input Forms
    And I click on subtab JQuary Select dropdown
    Then I Select India

  Scenario: 03 Multi Select - Search and Select multiple state
    Given I launch and login to the application
    And I click on tab Input Forms
    And I click on subtab JQuary Select dropdown
    Then I Select Florida and New Yark

  Scenario: 04 Drop Down with Disabled values
    Given I launch and login to the application
    And I click on tab Input Forms
    And I click on subtab JQuary Select dropdown
    Then I Select Florida and New Yark

  Scenario: 05 Drop-down with Category related options
    Given I launch and login to the application
    And I click on tab Input Forms
    And I click on subtab JQuary Select dropdown
    Then I Select Java
