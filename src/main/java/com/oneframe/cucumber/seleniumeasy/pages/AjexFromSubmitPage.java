package com.oneframe.cucumber.seleniumeasy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.oneframe.cucumber.oneframebase.utils.WebDriverFactory;

public class AjexFromSubmitPage {
    public AjexFromSubmitPage() {
        PageFactory.initElements(WebDriverFactory.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@class='dropdown-menu']//a[contains(text(),'Ajax Form Submit')]")
    private WebElement subTabAjaxFormSubmit;

    @FindBy(xpath = "//div[contains(text(),'Ajax Form')]")
    private WebElement ajaxFormSubmitText;

    @FindBy(xpath = "//input[@id='title']")
    private WebElement name;

    @FindBy(xpath = "//textarea[@id='description']")
    private WebElement fillcomment;
    @FindBy(xpath = "//input[@id='btn-submit']")
    private WebElement submitbutton;
    @FindBy(xpath = "//div[@id='submit-control']")
    private WebElement getmsg;

    public void clickOnSubTabAjaxFromSubmit() {
        WebDriverFactory.clickWebElement(subTabAjaxFormSubmit);
    }

    /**
     * verifyAjaxFromSubmitPage.
     *
     * @author sudheer.singh
     */
    public void verifyAjaxFromSubmitPage() {

        String ajaxFormSubmitTextCheck = ajaxFormSubmitText.getText();
        if (ajaxFormSubmitTextCheck.equalsIgnoreCase("Ajax Form")) {
            System.out.println("you are on AjaxFromSubmit ");

        }
    }

    public void enterName() {
        WebDriverFactory.sendKeys(name, "Vineet");

    }

    public void enterComment() {
        WebDriverFactory.sendKeys(fillcomment, "I have no specfic comment");
    }

    public void clickOnSubmit() {
        WebDriverFactory.clickWebElement(submitbutton);
    }

    /**
     * verifyAfterClickingOnSubmitButton.
     *
     * @author vineet
     */

    public void verifyAfterSubmit() throws InterruptedException {
        Thread.sleep(5000);
        String fetchMsg = getmsg.getText();
        System.out.println(fetchMsg);
    }

}