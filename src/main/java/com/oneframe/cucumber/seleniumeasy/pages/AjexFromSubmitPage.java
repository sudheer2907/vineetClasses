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
}