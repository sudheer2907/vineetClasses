package oneframe.cucumber.stepdefinitions.seleniumeasy.ui;

import com.oneframe.cucumber.seleniumeasy.pages.SelectDropdownListpage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TestSelectDropdownListPage {

    SelectDropdownListpage selectDropdownListpage;

    @Then("^I click on subtab Select dropdown List$")
    public void i_click_on_subtab_Select_dropdown_List() {
        selectDropdownListpage = new SelectDropdownListpage();

        selectDropdownListpage.clickonSubtabSelectDropDown();

    }

@Then("^I verify Select dropdown List Page is opened$")
public void i_verify_Select_dropdown_List_Page_is_opened() throws Throwable {
    String dropdownPagetextFetch =selectDropdownListpage.verifySelectDropDownListPage();
    
    if (dropdownPagetextFetch.equalsIgnoreCase("Multi Select List Demo")) {

        System.out.println("you are on Select Dropdown page");
}
}

@Given("^I selected Friday$")
public void i_selected_select_Friday() throws Throwable {
    selectDropdownListpage.selectFriday(); 
    
}

@Then("^I verify Friday is selected$")
public void i_verify_Friday_is_selected() throws Throwable {
   String daySelectedMsdFetch= selectDropdownListpage.daySelected();
  System.out.println("friday is selected");
  System.out.println(daySelectedMsdFetch);
    
}

@Given("^I selected Florida and New York$")
public void i_selected_Florida_and_New_York() throws Throwable {
    
    System.out.println("pending");
}

@Then("^Verify Florida and New York is selected$")
public void verify_Florida_and_New_York_is_selected() throws Throwable {
    System.out.println("pending ");
}

   
}