package oneframe.cucumber.stepdefinitions.seleniumeasy.ui;

import com.oneframe.cucumber.seleniumeasy.pages.CheckboxDemoPgae;

import cucumber.api.java.en.Then;

public class TestCheckboxDemo {

	
	CheckboxDemoPgae checkboxDemoPgae;
	
@Then("^I click on subtab Checkbox From Demo$")
public void i_click_on_subtab_Checkbox_From_Demo() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	checkboxDemoPgae =new CheckboxDemoPgae();
	checkboxDemoPgae.clickonCheckboxSubTab();
}

@Then("^I verify Checkbox Demo page$")
public void i_verify_Checkbox_Demo_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	checkboxDemoPgae =new CheckboxDemoPgae();
	checkboxDemoPgae.verifyCheckboxPage();
}
}