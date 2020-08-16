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

    @FindBy(id = "isAgeSelected")
    private WebElement singleCheckBox;

    @FindBy(xpath = "//label[text()='Option 1']")
    private WebElement option1st;

    @FindBy(xpath = "//label[text()='Option 4']")
    private WebElement option4th;

    @FindBy(xpath = "//label[text()='Option 2']")
    private WebElement option2nd;

    public void clickonCheckboxSubTab() {

        WebDriverFactory.clickWebElement(subTabCheckBoxDemo);
    }

    /**
     * This method will give you the page name.
     *
     * @return - page name.
     * @author vineet.
     */
    public String getPageName() {
        String checkboxPageTextToVerify = chekcboxPageText.getText();
        System.out.println(checkboxPageTextToVerify);
        return checkboxPageTextToVerify;
    }

    /**
     * Click on single checkbox button.
     *
     * @author MANISH KUMAR
     */
    public void clickOnSingleCheckbox() {
        WebDriverFactory.clickWebElement(singleCheckBox);

    }

    /**
     * Verify single checkbox button is selected.
     *
     * @return - true or false
     */
    public boolean isSingleCheckBoxButtonIsSelected() {
        return singleCheckBox.isSelected();
    }

    /**
     * click on option 1 and option 2.
     */

    public void clickOnOption1AndOption4() {
        WebDriverFactory.clickWebElement(option2nd);
        WebDriverFactory.clickWebElement(option4th);

    }

    /**
     * verifyOption1AndOption4IsClicked.
     *
     * @author sudheer.singh
     */
    public boolean verifyOption1AndOption4IsClicked() {

        boolean bool = option1st.isSelected() && option4th.isSelected();
        return true;
    }
}
