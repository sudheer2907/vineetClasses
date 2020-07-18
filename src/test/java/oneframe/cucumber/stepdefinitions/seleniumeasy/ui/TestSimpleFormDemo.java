package oneframe.cucumber.stepdefinitions.seleniumeasy.ui;

import com.oneframe.cucumber.oneframebase.utils.WebDriverFactory;
import com.oneframe.cucumber.seleniumeasy.pages.HomePage;
import com.oneframe.cucumber.seleniumeasy.pages.SimpleFormDemoPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

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

    @And("^I click on tab (.*)$")
    public void i_click_on_tab(String tabNameString) {
        homePage = new HomePage();
        homePage.clickonTab(tabNameString);
    }
}
