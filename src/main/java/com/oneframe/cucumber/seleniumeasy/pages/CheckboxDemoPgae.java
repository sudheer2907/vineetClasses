package com.oneframe.cucumber.seleniumeasy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.oneframe.cucumber.oneframebase.utils.LogPrinter;
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
    private WebElement option_1;

    @FindBy(xpath = "//label[text()='Option 4']")
    private WebElement option_4;
    
    @FindBy(xpath = "//label[text()='Option 2']")
    private WebElement option_2;
    

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
        WebDriverFactory.clickWebElement(option_2);
        WebDriverFactory.clickWebElement(option_4);

    }
public boolean verifyOption1AndOption4IsClicked() {
    
    boolean bi =option_1.isSelected()&&option_4.isSelected();
    return true ;
    }
}

