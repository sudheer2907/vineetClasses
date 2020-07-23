package oneframe.cucumber.stepdefinitions.seleniumeasy.ui;

import com.oneframe.cucumber.oneframebase.utils.WebDriverFactory;
import com.oneframe.cucumber.seleniumeasy.pages.HomePage;
import com.oneframe.cucumber.seleniumeasy.pages.SimpleFormDemoPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TestSimpleFormDemo {

    SimpleFormDemoPage simpleFormDemoPage;
    HomePage homePage;

    @Given("^I launch and login to the application$")
    public void i_launch_and_login_to_the_application() {
        WebDriverFactory.openApplication();
        simpleFormDemoPage = new SimpleFormDemoPage();
        simpleFormDemoPage.acceptAnAlert();
        WebDriverFactory.waitForPageToLoad(30);
    }

    @And("^I click on tab Input Forms$")
    public void i_click_on_tab_Input_Forms() {
    	simpleFormDemoPage.clickOntab();
    	
    }
    @Then("^I click on subtab Simple From Demo$")
    public void i_click_on_subtab_Simple_From_Demo()  {
    	simpleFormDemoPage = new SimpleFormDemoPage();
    	simpleFormDemoPage.clickOnSubtab();
      
    }

    @Then("^I verify Simple From Demo page$")
    public void i_verify_Simple_From_Demo_page()  {
    	simpleFormDemoPage.VerifySmimpleDemoPage();
    }
}
