package oneframe.cucumber.stepdefinitions.seleniumeasy.ui;

import com.oneframe.cucumber.seleniumeasy.pages.AjexFromSubmitPage;

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

}
