@Test_checkbox_demo
Feature: Test Check box Demo Page

  #Author vineet pandey
  Scenario: 01 verify checkbox demo page is open
    Given I launch and login to the application
    And I click on tab Input Forms
    Then I click on subtab Checkbox From Demo
    Then I verify checkbox demo page opened successfuly

  Scenario: 02 click on single check box demo
    Given I launch and login to the application
    And I click on tab Input Forms
    And I click on subtab Checkbox From Demo
    And I click on Click on this check box
    Then I verify single check box is clicked

  Scenario: 03 click on multiple check box demo
    Given I launch and login to the application
    And I click on tab Input Forms
    And I click on subtab Checkbox From Demo
   # And I click option1 and option4
    And I click first option and last option
   # Then I verif option1 and option4 is clicked
    Then I verify option first and option last is clicked 
