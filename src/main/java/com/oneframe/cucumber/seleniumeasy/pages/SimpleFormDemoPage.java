package com.oneframe.cucumber.seleniumeasy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.oneframe.cucumber.oneframebase.utils.WebDriverFactory;

public class SimpleFormDemoPage {
    WebDriver driver;

    public SimpleFormDemoPage() {
        PageFactory.initElements(WebDriverFactory.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='dropdown-toggle'][contains(text(),'Input Forms')]")
    private WebElement tabInputForms;

    @FindBy(xpath = "//ul[@class='dropdown-menu']//a[contains(text(),'Simple Form Demo')]")
    private WebElement subTabSimpleFormDemo;

    @FindBy(xpath = "//a[@class='at-cv-button at-cv-lightbox-yesno at-cm-no-button']")
    private WebElement acceptAnAlert;

    @FindBy(xpath = "//input[@id='user-message']")
    private WebElement txtBoxEnterMessage;

    @FindBy(xpath = "//button[contains(text(),'Show Message')]")
    private WebElement buttonShowMessage;

    @FindBy(xpath = "//label[contains(text(),'Your Message:')]/following-sibling::span")
    private WebElement labelGetShowMessageOutput;

    @FindBy(xpath = "//div[@class='panel-heading']")
    private WebElement singleinputField;

    public void acceptAnAlert() {
        WebDriverFactory.waitForAnElementToBeVisible(acceptAnAlert, 30);
        WebDriverFactory.clickWebElement(acceptAnAlert);
    }

    /**
     * Click on subtab.
     *
     * @author sudheer.singh
     */
    public void clickOntab() {
        WebDriverFactory.waitForAnElementToBeVisible(tabInputForms, 50);

        tabInputForms.click();
    }

    /**
     * Click on subtab.
     *
     * @author sudheer.singh
     */
    public void clickOnSubtab() {
        WebDriverFactory.waitForAnElementToBeVisible(subTabSimpleFormDemo, 50);
        subTabSimpleFormDemo.click();
    }

    /**
     * Enter any text into Enter message textbox.
     *
     * @param arg
     *            - text to be entered into message textbox.
     * @author sudheer.singh
     */
    /**
     * Click on subtab.
     *
     * @author sudheer.singh
     */
    public void VerifySmimpleDemoPage() {

        String displayText = singleinputField.getText();
        System.out.println(displayText);
        Assert.assertEquals(displayText, "Menu List", "You are on Simple From demo page");
        Assert.assertEquals(displayText, "Menu List");

        Assert.assertEquals(displayText, "Menu List", "Menu List\",\"You are on Simple From demo page");

    }

    public void enterTextIntoMessageBox(String arg) {
        WebDriverFactory.sendKeys(txtBoxEnterMessage, arg);
    }

    /**
     * Click show message button.
     *
     * @author sudheer.singh
     */
    public void clickShowMessageButton() {
        WebDriverFactory.clickWebElement(buttonShowMessage);
    }

    /**
     * Get text message entered into the enter message text box.
     *
     * @author sudheer.singh
     */
    public String getTextShowMessage() {
        WebDriverFactory.waitForAnElementToBeVisible(labelGetShowMessageOutput, 4);
        return labelGetShowMessageOutput.getText();
    }
}
