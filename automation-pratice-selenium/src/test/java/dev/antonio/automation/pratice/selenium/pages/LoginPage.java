package dev.antonio.automation.pratice.selenium.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
	//Locators
	private By emailAddressLocator = By.name("email");
	private By passwordAddressLocator = By.name("password");
	private By submitBtnElement = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");
	private By TagMyCategory = By.name("h2");

	
	public void signin() {
		if(super.isDisplayed(emailAddressLocator)) {
			super.type("antoniobigas@gmail.com", emailAddressLocator);
			super.type("151413", passwordAddressLocator);
			super.click(submitBtnElement);
		} else {
			System.out.println("email textbox was not present");
		}
	}
	
	public String getMyCategoryMessage() {
		return super.getText(TagMyCategory);
	}
	

}
