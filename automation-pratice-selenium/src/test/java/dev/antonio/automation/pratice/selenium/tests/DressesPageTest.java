package dev.antonio.automation.pratice.selenium.tests;
package dev.camila.automation.pratice.selenium.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.antonio.automation.pratice.selenium.pages.BasePage;
import dev.antonio.automation.pratice.selenium.pages.DressesPage;


class DressesPageTest {
	private DressesPage dressesPage;
	private final String URL = "https://automationexercise.com/";

	@BeforeEach
	void setUp() throws Exception {
		this.dressesPage = new DressesPage();
		((BasePage) this.dressesPage).visit(this.URL);
	}

	@AfterEach
	void tearDown() throws Exception {
		//this.dressesPage.quitWebDriver();
	}

	@Test
	void test() {
		//when
		this.dressesPage.viewCasualDressesPage();
		
		//then
		Assertions.assertEquals("CASUAL DRESSES ", this.dressesPage.getTitlePage());
		Assertions.assertFalse(this.URL.equals(dressesPage.getCurrentUrl()));
	}
}