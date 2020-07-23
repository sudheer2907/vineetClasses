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
	
	@FindBy(xpath="//div[contains(text(),'Radio Button Demo')]")
	private WebElement dropdownPageText;
	 
	public void ClickOnSubTabRadioButton() {
		
		WebDriverFactory.clickWebElement(subTabRadioButtonDemo);
	}
	public void VerifyRadioButtonPage() {
		String dropdownPageTextToVerify = dropdownPageText.getText();
		System.out.println(dropdownPageTextToVerify);
	}
	}


