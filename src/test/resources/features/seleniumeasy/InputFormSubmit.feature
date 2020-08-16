
@InputFromSubmit
Feature: Test Input Form Submit Page
 
 Scenario: 01 Test Input From Submit Page
    Given I launch and login to the application
    And I click on tab Input Forms
    Then I click on subtab Inout Form Submit
    Then I verify Input From Submit Page is opened
    Scenario:02 Fill Input From validations
    Given I launch and login to the application
    And I click on tab Input Forms
    Then I click on subtab Inout Form Submit
    And Enter First Name 
    And Enter Last Name 
    And Enter Email
    And Enter Phone number
    And Enter Address 
    And Enter City
    And Select state
    And Enter Zipcode
    And Enter Domain Name
    And Click hosting Yes
    And Enter Project Description
    Then Click on Send
    
    
 

