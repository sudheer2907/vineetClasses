package com.oneframe.cucumber.seleniumeasy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.oneframe.cucumber.oneframebase.utils.WebDriverFactory;

public class RadioButtonDemoPage {
    WebDriver driver;

    public RadioButtonDemoPage() {
        PageFactory.initElements(WebDriverFactory.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@class='dropdown-menu']//a[contains(text(),'Radio Buttons Demo')]")
    private WebElement subTabRadioButtonDemo;

    @FindBy(xpath = "//div[contains(text(),'Radio Button Demo')]")
    private WebElement dropdownPageText;

    @FindBy(xpath = "//input[@value='Male']")
    private WebElement maleInRadioButtonSection;

    @FindBy(xpath = "//button[@id='buttoncheck']")
    private WebElement getValueCheck;
    @FindBy(xpath = "//p[@class='radiobutton']")
    private WebElement messageByGetValueCheck;

    @FindBy(xpath = "//html//body//div//div//div//div//div//div//label[contains(text(),'Female')]//input\r\n" + "")
    private WebElement femaleFromGroupRadioButton;

    @FindBy(xpath = "//label[contains(text(),'15 to 50')]")
    private WebElement clickOn15to50AgeGroup;

    @FindBy(xpath = "//button[contains(text(),'Get values')]")
    private WebElement getValue;

    @FindBy(xpath = "//p[@class='groupradiobutton']")
    private WebElement getValuetext;

    /**
     * jljljl.
     */
    public void clickOnSubTabRadioButton() {
        WebDriverFactory.clickWebElement(subTabRadioButtonDemo);
    }

    /**
     * kljlkjkl.
     *
     * @return - pageNameStr
     */
    public String getPageText() {
        String pageNameStr = dropdownPageText.getText();
        return pageNameStr;
    }

    public void clickOnMale() {
        WebDriverFactory.clickWebElement(maleInRadioButtonSection);
    }

    /**
     * Read get check value mgs.
     *
     * @return fetchMsg
     */
    public String getCheckValueMsg() {
        WebDriverFactory.clickWebElement(getValueCheck);
        String fetchMsg = messageByGetValueCheck.getText();
        return fetchMsg;
    }

    public void clickFemaleInGroupRadioButton() {
        WebDriverFactory.clickWebElement(femaleFromGroupRadioButton);

    }

    public void clickon15to60() {
        WebDriverFactory.clickWebElement(clickOn15to50AgeGroup);
    }

    /**
     * Verify group radio button section.
     *
     * @return - getValueText
     */

    public String verifyGroupRadioButtonSection() {
        WebDriverFactory.clickWebElement(getValue);
        String getValueText = getValuetext.getText();
        return getValueText;

    }
}
