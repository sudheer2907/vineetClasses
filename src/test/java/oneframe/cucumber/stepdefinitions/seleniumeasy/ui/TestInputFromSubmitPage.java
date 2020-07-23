package oneframe.cucumber.stepdefinitions.seleniumeasy.ui;

import com.oneframe.cucumber.seleniumeasy.pages.InputFromSubmitPage;

import cucumber.api.java.en.Then;

public class TestInputFromSubmitPage {
	InputFromSubmitPage inputFromSubmitPage;
	
	@Then("^I click on subtab Inout Form Submit$")
	public void i_click_on_subtab_Inout_Form_Submit() throws Throwable {
		inputFromSubmitPage = new InputFromSubmitPage();
		inputFromSubmitPage.clicksubTabInputFormSubmit();
	}

	@Then("^I verify Input From Submit Page$")
	public void i_verify_Input_From_Submit_Page() throws Throwable {
		inputFromSubmitPage.verifyInputFromSubmitPage();  
}
	
}


