package dev.antonio.automation.pratice.selenium.pages;

import org.openqa.selenium.By;

public class DressesPage extends BasePage {
	//Locators
	private By menuDressesLocator = By.cssSelector("#block_top_menu > ul > li:nth-child(2) > a");
	private By submenuCasualDressesLocator = By.cssSelector("#block_top_menu > ul > li:nth-child(2) > ul > li:nth-child(1) > a");
	private By titleCasualDressesPageLocator = By.className("cat-name");
	
	public String getTitlePage() {
		return super.getText(titleCasualDressesPageLocator);
	}

	@Override
	protected void actionMoveToElementClickPerform(By submenuCasualDressesLocator) {
		// TODO Auto-generated method stub
		
	}
	
	

}