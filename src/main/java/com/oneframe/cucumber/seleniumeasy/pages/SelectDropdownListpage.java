package com.oneframe.cucumber.seleniumeasy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.oneframe.cucumber.oneframebase.utils.WebDriverFactory;

public class SelectDropdownListpage {

    public SelectDropdownListpage() {
        PageFactory.initElements(WebDriverFactory.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@class='dropdown-menu']//a[contains(text(),'Select Dropdown List')]")
    private WebElement subTabSelectDropDownList;

    @FindBy(xpath = "//div[contains(text(),'Multi Select List Demo')]")
    private WebElement selectDropDownListText;

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
    public void verifySelectDropDownListPage() {

        String selectDropDownListTextGet = selectDropDownListText.getText();
        System.out.println(selectDropDownListTextGet);
        if (selectDropDownListTextGet.equalsIgnoreCase("Multi Select List Demo")) {

            System.out.println(" you are on Select Dropdown page");
        }
    }
}
