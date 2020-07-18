package com.oneframe.cucumber.seleniumeasy.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.oneframe.cucumber.oneframebase.utils.WebDriverFactory;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(WebDriverFactory.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='dropdown-toggle'][contains(text(),'Input Forms')]")
    private WebElement tabInputForms;

    /**
     * Click on tab.
     *
     * @param tabString
     *            - tab name.
     * @author sudheer.singh
     */
    public void clickonTab(String tabString) {
        System.out.println("Tab to be clicked is " + tabString);
        switch (tabString) {
        case "Input Forms":
            WebDriverFactory.waitForAnElementToBeVisible(tabInputForms, 30);
            WebDriverFactory.clickWebElement(tabInputForms);
            break;
        default:
            Assert.fail("Wrong Sub tab name is provided.");
        }
    }
}
