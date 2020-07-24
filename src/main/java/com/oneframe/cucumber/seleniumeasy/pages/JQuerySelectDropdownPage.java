package com.oneframe.cucumber.seleniumeasy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.oneframe.cucumber.oneframebase.utils.WebDriverFactory;

public class JQuerySelectDropdownPage {
    public JQuerySelectDropdownPage() {
        PageFactory.initElements(WebDriverFactory.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@class='dropdown-menu']//a[contains(text(),'JQuery Select dropdown')]")
    private WebElement subTabJQuerySelectDropdown;

    @FindBy(xpath = "//h3[contains(text(),'Drop Down with Search box')]")
    private WebElement jquerySelectDropdownText;

    public void clickOnsubTabJQuerySelectDropdown() {
        WebDriverFactory.clickWebElement(subTabJQuerySelectDropdown);
    }

    /**
     * Click on verifyJQuerySelectDropdownPage.
     *
     * @author sudheer.singh
     */
    public void verifyJQuerySelectDropdownPage() {

        String jquerySelectDropdownTextCheck = jquerySelectDropdownText.getText();
        if (jquerySelectDropdownTextCheck.equalsIgnoreCase("Drop Down with Search box")) {
            System.out.println("you are on JQuery Select Dropdown Page");
        }
    }
}
