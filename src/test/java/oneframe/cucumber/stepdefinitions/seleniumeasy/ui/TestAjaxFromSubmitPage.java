package oneframe.cucumber.stepdefinitions.seleniumeasy.ui;

import com.oneframe.cucumber.seleniumeasy.pages.AjexFromSubmitPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TestAjaxFromSubmitPage {

    AjexFromSubmitPage ajexFromSubmitPage;

    @Then("^I click on subtab Ajex Form Submit$")
    public void i_click_on_subtab_Ajex_Form_Submit() throws Throwable {
        ajexFromSubmitPage = new AjexFromSubmitPage();
        ajexFromSubmitPage.clickOnSubTabAjaxFromSubmit();
    }

    @Then("^I verify Ajex Form Submit Page$")
    public void i_verify_Ajex_Form_Submit_Page() throws Throwable {
        ajexFromSubmitPage.verifyAjaxFromSubmitPage();
    }


@Given("^I Enter Name$")
public void i_Enter_Name() throws Throwable {
    ajexFromSubmitPage.enterName();
}

@Given("^I Enter Comment$")
public void i_Enter_Comment() throws Throwable {
    ajexFromSubmitPage.enterComment();
}

@Given("^i Click on Submit Button$")
public void i_Click_on_Submit_Button() throws Throwable {
    ajexFromSubmitPage.clickOnSubmit();
}

@Then("^Verify Submitted Successfully$")
public void verify_Submitted_Successfully() throws Throwable {
    ajexFromSubmitPage.verifyAfterSubmit();
}

}
