package dev.antonio.automation.pratice.selenium.tests;
import org.junit.jupiter.api.*;


import dev.antonio.automation.pratice.selenium.pages.LoginPage;

class LoginPageTest {

	private LoginPage loginPage;
	private final String URL = "https://automationexercise.com/login";
	
	@BeforeEach
	void setUp() throws Exception {
		loginPage = new LoginPage();
		loginPage.visit(this.URL);
	}

	@AfterEach
	void tearDown() throws Exception {
		loginPage.quitWebDriveR();
	}

	@Test
	void test() {
		//when
		loginPage.signin();
		
		//then
		Assertions.assertTrue(this.loginPage.getMyCategoryMessage().equals("CART"));
		Assertions.assertFalse(this.loginPage.getCurrentUrl().equals(this.URL));
	}

}
