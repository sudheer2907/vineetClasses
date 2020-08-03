package oneframe.cucumber.stepdefinitions.seleniumeasy.ui.checkboxdemopage;

import org.testng.Assert;

import com.oneframe.cucumber.oneframebase.utils.LogPrinter;
import com.oneframe.cucumber.seleniumeasy.pages.CheckboxDemoPgae;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TestCheckboxPage {

    CheckboxDemoPgae checkboxDemoPgae;

    @Then("^I click on subtab Checkbox From Demo$")
    public void i_click_on_subtab_Checkbox_From_Demo() throws Throwable {
        checkboxDemoPgae = new CheckboxDemoPgae();
        checkboxDemoPgae.clickonCheckboxSubTab();
    }

    @Then("^I verify checkbox demo page opened successfuly$")
    public void i_verify_Checkbox_Demo_page() throws Throwable {
        String pageNameFetched = checkboxDemoPgae.getPageName();
        Assert.assertFalse(pageNameFetched.equalsIgnoreCase("Checkbox demo page"),"Check box page is not verified");
    }
    
    @And("^I click on Click on this check box$")
    public void i_click_on_this_checkbox() {
        checkboxDemoPgae.clickOnSingleCheckbox();    
    }
    
    @Then("^I verify single check box is clicked$")
    public void i_verify_single_check_box_is_clicked() {
        boolean isSingleCheckBoxSelected = checkboxDemoPgae.isSingleCheckBoxButtonIsSelected();
        Assert.assertFalse(!isSingleCheckBoxSelected,"Single Checkbox button is not selected");
        LogPrinter.printLog("Hi");
     
}
    @Given("^I click first option and last option$")
    public void i_click_first_option_and_last_option() throws Throwable {
        
        checkboxDemoPgae.clickOnOption1AndOption4();
    }

    @Then("^I verify option first and option last is clicked$")
    public void i_verify_option_first_and_option_last_is_clicked() throws Throwable {
       boolean c2 = checkboxDemoPgae.verifyOption1AndOption4IsClicked();
        
        if (c2==false) {
    LogPrinter.printLog("gdrhrtjtk33333333333333333");
    }
}}