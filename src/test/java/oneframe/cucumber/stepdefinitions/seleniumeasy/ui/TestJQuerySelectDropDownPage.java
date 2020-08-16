package oneframe.cucumber.stepdefinitions.seleniumeasy.ui;

import com.oneframe.cucumber.seleniumeasy.pages.JQuerySelectDropdownPage;

import cucumber.api.java.en.Then;

public class TestJQuerySelectDropDownPage {

    JQuerySelectDropdownPage jQuerySelectDropdownPage;

    @Then("^I click on subtab JQuary Select dropdown$")
    public void i_click_on_subtab_JQuary_Select_dropdown() throws Throwable {
        jQuerySelectDropdownPage = new JQuerySelectDropdownPage();
        jQuerySelectDropdownPage.clickOnsubTabJQuerySelectDropdown();

    }

    @Then("^I verify JQuary Select dropdown Page is open Successfully$")
    public void i_verify_JQuary_Select_dropdown_Page() throws Throwable {

        jQuerySelectDropdownPage.verifyJQuerySelectDropdownPage();

    }
    @Then("^I Select India$")
    public void i_Select_India() throws Throwable {
        jQuerySelectDropdownPage.selectCountry();  
    }
    

    @Then("^I Select Florida and New Yark$")
    public void i_Select_Florida_and_New_Yark() throws Throwable {
    }

    @Then("^I Select Java$")
    public void i_Select_Java() throws Throwable {
        
        
    }
}
