package oneframe.cucumber.stepdefinitions.seleniumeasy.ui;

import org.testng.Assert;

import com.oneframe.cucumber.oneframebase.utils.LogPrinter;
import com.oneframe.cucumber.seleniumeasy.pages.RadioButtonDemoPage;

import cucumber.api.java.en.Then;

public class TestRadioButtonpage {
    RadioButtonDemoPage radioButtonDemoPage;

    @Then("^I click on subtab Radio Buttons Demo$")
    public void i_click_on_subtab_Radio_Buttons_Demo() throws Throwable {
        radioButtonDemoPage = new RadioButtonDemoPage();
        radioButtonDemoPage.clickOnSubTabRadioButton();

    }

    @Then("^I verify Radio Buttons Demo Page is opened successfully$")
    public void i_verify_Buttons_Demo_Page() throws Throwable {
        String pageNameFetched = radioButtonDemoPage.getPageText();
        Assert.assertFalse(pageNameFetched.equalsIgnoreCase("Radio Button Demo"),"hi .....");
    }
}
