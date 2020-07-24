package com.oneframe.cucumber.seleniumeasy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.oneframe.cucumber.oneframebase.utils.WebDriverFactory;

public class CheckboxDemoPgae {

    WebDriver driver;

    public CheckboxDemoPgae() {
        PageFactory.initElements(WebDriverFactory.getDriver(), this);

    }

    @FindBy(xpath = "//ul[@class='dropdown-menu']//a[contains(text(),'Checkbox Demo')]")
    private WebElement subTabCheckBoxDemo;

    @FindBy(xpath = "//div[contains(text(),'Single Checkbox Demo')]")
    private WebElement chekcboxPageText;

    public void clickonCheckboxSubTab() {

        WebDriverFactory.clickWebElement(subTabCheckBoxDemo);
    }

    public void verifyCheckboxPage() {
        String checkboxPageTextToVerify = chekcboxPageText.getText();
        System.out.println(checkboxPageTextToVerify);
    }

}
