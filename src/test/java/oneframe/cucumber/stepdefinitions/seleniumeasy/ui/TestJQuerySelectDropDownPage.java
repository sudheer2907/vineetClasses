package oneframe.cucumber.stepdefinitions.seleniumeasy.ui;

import com.oneframe.cucumber.seleniumeasy.pages.JQuerySelectDropdownPage;

import cucumber.api.java.en.Then;

public class TestJQuerySelectDropDownPage {
	
	JQuerySelectDropdownPage jQuerySelectDropdownPage;
	
	@Then("^I click on subtab JQuary Select dropdown$")
	public void i_click_on_subtab_JQuary_Select_dropdown() throws Throwable {
		jQuerySelectDropdownPage = new JQuerySelectDropdownPage();
		jQuerySelectDropdownPage.ClickOnsubTabJQuerySelectDropdown();
	    
	}

	@Then("^I verify JQuary Select dropdown Page$")
	public void i_verify_JQuary_Select_dropdown_Page() throws Throwable {
		
		jQuerySelectDropdownPage.verifyJQuerySelectDropdownPage();
	    
	}
}
