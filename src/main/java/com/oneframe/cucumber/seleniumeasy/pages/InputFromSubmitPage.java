package com.oneframe.cucumber.seleniumeasy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.oneframe.cucumber.oneframebase.utils.WebDriverFactory;

public class InputFromSubmitPage {
    public InputFromSubmitPage() {
        PageFactory.initElements(WebDriverFactory.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@class='dropdown-menu']//a[contains(text(),'Input Form Submit')]")
    private WebElement subTabInputFormSubmit;

    @FindBy(xpath = "//h2[contains(text(),'Input form with validations')]")
    private WebElement inputFormSubmitText;
    @FindBy(xpath = "//input[@placeholder='First Name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@placeholder='E-Mail Address']")
    private WebElement email;

    @FindBy(xpath = "//input[@placeholder='(845)555-1212']")
    private WebElement phone;

    @FindBy(xpath = "//input[@placeholder='Address']")
    private WebElement address;

    @FindBy(xpath = "//input[@placeholder='city']")
    private WebElement city;

    @FindBy(xpath = "//select[@name='state']")
    private WebElement state;

    @FindBy(xpath = "//input[@placeholder='Zip Code']")

    private WebElement zipcode;

    @FindBy(xpath = "//input[@placeholder='Website or domain name']")
    private WebElement domainName;

    @FindBy(xpath = "//div[@class='col-md-4']//div[1]//label[1]//input[1]")
    private WebElement hostingYes;

    @FindBy(xpath = "//textarea[@placeholder='Project Description']")
    private WebElement projectDescriptio;

    @FindBy(xpath = "//button[@class='btn btn-default']")
    private WebElement sendButton;

    public void clicksubTabInputFormSubmit() {

        WebDriverFactory.clickWebElement(subTabInputFormSubmit);
    }

    /**
     * Click on verifyInputFromSubmitPage.
     *
     * @author sudheer.singh
     */
    public void verifyInputFromSubmitPage() {

        String inputFormSubmitTextCheck = inputFormSubmitText.getText();
        if (inputFormSubmitTextCheck.equalsIgnoreCase("Input form with validations")) {

            System.out.println("you are on Input from submit page ");
        }
    }

    public void enterFirstName() {
        WebDriverFactory.sendKeys(firstName, "Vineet");
    }

    public void enterLastName() {
        WebDriverFactory.sendKeys(lastName, "Pandey");
    }

    public void enterEmail() {
        WebDriverFactory.sendKeys(email, "abc@gmail.com");

    }

    public void enterPhoneNumber() {
        WebDriverFactory.sendKeys(phone, "1234567890");
    }

    public void enterAddress() {

        WebDriverFactory.sendKeys(address, "India");
    }

    public void enterCity() {
        WebDriverFactory.sendKeys(city, "Pune");
    }

    /**
     * Select state.
     *
     * @author sudheer.singh
     */
    public void selectState() {

        WebDriverFactory.selectElementByvalue(state, "Iowa");

    }

    public void enterZipCode() {
        WebDriverFactory.sendKeys(zipcode, "411019");

    }

    public void enterDomainName() {
        WebDriverFactory.sendKeys(domainName, "qwerty.com");
    }

    public void selectHostingYes() {
        WebDriverFactory.clickWebElement(hostingYes);
    }

    public void describeProject() {
        WebDriverFactory.sendKeys(projectDescriptio, "This project is for Practice purpose only");
    }

    public void clickOnSendButton() {

        WebDriverFactory.clickWebElement(sendButton);
    }

}
