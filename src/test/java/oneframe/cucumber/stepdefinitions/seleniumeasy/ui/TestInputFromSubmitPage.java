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

    @Then("^I verify Input From Submit Page is opened$")
    public void i_verify_Input_From_Submit_Page() throws Throwable {
        inputFromSubmitPage.verifyInputFromSubmitPage();
    }

@Then("^Enter First Name$")
public void enter_First_Name() throws Throwable {
    inputFromSubmitPage.enterDomainName();
}

@Then("^Enter Last Name$")
public void enter_Last_Name() throws Throwable {
    inputFromSubmitPage.enterLastName();
}

@Then("^Enter Email$")
public void enter_Email() throws Throwable {
    inputFromSubmitPage.enterEmail();
}

@Then("^Enter Phone number$")
public void enter_Phone_number() throws Throwable {
    inputFromSubmitPage.enterPhoneNumber();
}

@Then("^Enter Address$")
public void enter_Address() throws Throwable {
    inputFromSubmitPage.enterAddress();
}

@Then("^Enter City$")
public void enter_City() throws Throwable {
    inputFromSubmitPage.enterCity();
}

@Then("^Select state$")
public void select_state() throws Throwable {
    inputFromSubmitPage.selectState();
}

@Then("^Enter Zipcode$")
public void enter_Zipcode() throws Throwable {
    inputFromSubmitPage.enterZipCode();
}

@Then("^Enter Domain Name$")
public void enter_Domain_Name() throws Throwable {
    inputFromSubmitPage.enterDomainName();
}

@Then("^Click hosting Yes$")
public void click_hosting_Yes() throws Throwable {
    inputFromSubmitPage.selectHostingYes();
}

@Then("^Enter Project Description$")
public void enter_Project_Description() throws Throwable {
    inputFromSubmitPage.describeProject();
}

@Then("^Click on Send$")
public void click_on_Send() throws Throwable {
    inputFromSubmitPage.clickOnSendButton();
}
}
