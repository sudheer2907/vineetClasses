@AjexFormSubmit
Feature: Test Ajex From Submit Page

  Scenario: 0 Test Ajex Form Submit Page
    Given I launch and login to the application
    And I click on tab Input Forms
    Then I click on subtab Ajex Form Submit
    Then I verify Ajex Form Submit Page

  Scenario: Fill Name and Comment section
    Given I launch and login to the application
    And I click on tab Input Forms
    And I click on subtab Ajex Form Submit
    And I Enter Name
    And I Enter Comment
    And i Click on Submit Button
    Then Verify Submitted Successfully
