package com.oneframe.cucumber.seleniumeasy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.oneframe.cucumber.oneframebase.utils.WebDriverFactory;

public class SelectDropdownListpage {

    public SelectDropdownListpage() {
        PageFactory.initElements(WebDriverFactory.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@class='dropdown-menu']//a[contains(text(),'Select Dropdown List')]")
    private WebElement subTabSelectDropDownList;

    @FindBy(xpath = "//div[contains(text(),'Multi Select List Demo')]")
    private WebElement selectDropDownListText;

    @FindBy(xpath = "//select[@id='select-demo']")
    private WebElement selectDays;
    @FindBy(xpath = "//p[@class='selected-value']")
    private WebElement daySelectedText;

    /**
     * Click on subtab.
     *
     * @author sudheer.singh
     */
    public void clickonSubtabSelectDropDown() {

        WebDriverFactory.clickWebElement(subTabSelectDropDownList);

    }

    /**
     * verifySelectDropDownListPage.
     *
     * @author sudheer.singh
     */
    public String verifySelectDropDownListPage() {

        String selectDropDownListTextGet = selectDropDownListText.getText();
        return selectDropDownListTextGet;
    }

    public void selectFriday() {
        Select selectDay = new Select(selectDays);
        selectDay.selectByVisibleText("Friday");
    }

    /**
     * Click on select day.
     *
     * @author Vineet
     */
    public String daySelected() {
        String daySelctedTextMsg = daySelectedText.getText();
        return daySelctedTextMsg;

    }
}