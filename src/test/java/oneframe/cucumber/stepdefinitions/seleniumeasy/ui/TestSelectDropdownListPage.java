package oneframe.cucumber.stepdefinitions.seleniumeasy.ui;

import com.oneframe.cucumber.seleniumeasy.pages.SelectDropdownListpage;

import cucumber.api.java.en.Then;

public class TestSelectDropdownListPage {

	SelectDropdownListpage selectDropdownListpage;
	
	@Then("^I click on subtab Select dropdown List$")
	public void i_click_on_subtab_Select_dropdown_List(){
		selectDropdownListpage = new SelectDropdownListpage();
		
		selectDropdownListpage.clickonSubtabSelectDropDown();
	  
	}

	@Then("^I verify Select dropdown List$")
	public void i_verify_Select_dropdown_List(){
		selectDropdownListpage.verifySelectDropDownListPage();
	  
}
}