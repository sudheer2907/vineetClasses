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
	private WebElement SelectDropDownListText;

	public void clickonSubtabSelectDropDown() {

		WebDriverFactory.clickWebElement(subTabSelectDropDownList);

	}

	public void verifySelectDropDownListPage() {
		
		String SelectDropDownListTextGet = SelectDropDownListText.getText();
		System.out.println(SelectDropDownListTextGet);
		if(SelectDropDownListTextGet.equalsIgnoreCase("Multi Select List Demo")) {
			
			System.out.println(" you are on Select Dropdown page");
		}
	}
}
