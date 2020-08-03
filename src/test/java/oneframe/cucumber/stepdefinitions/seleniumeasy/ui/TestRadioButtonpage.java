package oneframe.cucumber.stepdefinitions.seleniumeasy.ui;

import org.testng.Assert;

import com.oneframe.cucumber.oneframebase.utils.LogPrinter;
import com.oneframe.cucumber.seleniumeasy.pages.RadioButtonDemoPage;

import cucumber.api.java.en.Given;
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

@Given("^I click Male radio Button$")
public void i_click_Male_radio_Button() throws Throwable {
    radioButtonDemoPage.clickOnMale();
    
    
}

@Then("^verify Male radio button is clicked$")
public void verify_Male_radio_button_is_clicked() throws Throwable {
   String fetchMsg= radioButtonDemoPage.getCheckValueMsg();
   Assert.assertEquals(fetchMsg, "Radio button 'Male' is checked", "Male Radio button is clicked");
}

@Given("^I click on sex Female radio button and Age group (\\d+)to(\\d+)$")
public void i_click_on_sex_Female_radio_button_and_Age_group_to(int arg1, int arg2) throws Throwable {
    radioButtonDemoPage.clickFemaleInGroupRadioButton();
    radioButtonDemoPage.clickon15to60();
    
}

@Then("^veify get value$")
public void veify_get_value() {
   String getPageTextFetched =radioButtonDemoPage.verifyGroupRadioButtonSection();
    LogPrinter.printLog(getPageTextFetched);
    
}

    
    
}
