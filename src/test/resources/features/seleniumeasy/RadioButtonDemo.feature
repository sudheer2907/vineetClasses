@Test_RadioButtonPage
Feature: Test Radio Button Demo Page

  #Author vineet pandey
  Scenario: 01 Test Radio buttons Demo Page
    Given I launch and login to the application
    And I click on tab Input Forms
    When I click on subtab Radio Buttons Demo
    Then I verify Radio Buttons Demo Page is opened successfully

  Scenario: Click on Male Radio button
    Given I launch and login to the application
    And I click on tab Input Forms
    And I click on subtab Radio Buttons Demo
    And I click Male radio Button
    Then verify Male radio button is clicked

  Scenario: Click on Group Radio button
    Given I launch and login to the application
    And I click on tab Input Forms
    And I click on subtab Radio Buttons Demo
    And I click on sex Female radio button and Age group 15to50
    Then veify get value
