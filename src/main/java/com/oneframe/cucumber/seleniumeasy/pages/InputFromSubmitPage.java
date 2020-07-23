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
	private WebElement InputFormSubmitText;
	
	public void clicksubTabInputFormSubmit() {
		
		WebDriverFactory.clickWebElement(subTabInputFormSubmit);
	}
	public void verifyInputFromSubmitPage() {
		
		String InputFormSubmitTextCheck =InputFormSubmitText.getText();
		if(InputFormSubmitTextCheck.equalsIgnoreCase("Input form with validations")) {
			
			System.out.println("you are on Input from submit page ");
		}
	}
}
