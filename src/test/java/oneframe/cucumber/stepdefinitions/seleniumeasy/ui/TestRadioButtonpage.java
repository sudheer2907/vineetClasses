package oneframe.cucumber.stepdefinitions.seleniumeasy.ui;

import com.oneframe.cucumber.oneframebase.utils.WebDriverFactory;
import com.oneframe.cucumber.seleniumeasy.pages.RadioButtonDemoPage;

import cucumber.api.java.en.Then;

public class TestRadioButtonpage {
	RadioButtonDemoPage radioButtonDemoPage;

	@Then("^I click on subtab Radio Buttons Demo$")
	public void i_click_on_subtab_Radio_Buttons_Demo() throws Throwable {
		radioButtonDemoPage = new RadioButtonDemoPage();
		radioButtonDemoPage.ClickOnSubTabRadioButton();

	}

	@Then("^I verify Buttons Demo Page$")
	public void i_verify_Buttons_Demo_Page() throws Throwable {
		radioButtonDemoPage.VerifyRadioButtonPage();
	}
}
