package dev.antonio.automation.pratice.selenium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginTest {
	private WebDriver driver;
	
	@BeforeEach
	void setUp() throws Exception {
    	System.getProperty("webdriver.chrome.driver", "drivers/chromedriver");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://automationexercise.com/login");
	}

	@AfterEach
	void tearDown() throws Exception {
	
	}

	@Test
	void test() {
	WebElement emailAddressLocator = driver.findElement(By.name("email"));
	emailAddressLocator.sendKeys("antoniobigas@gmail.com");
	
	WebElement passwordAddressLocator = driver.findElement(By.name("password"));
	passwordAddressLocator.sendKeys("151413");
	
	WebElement submitBtnElement = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button"));
	submitBtnElement.click();
	
	WebElement tagMyCategory = driver.findElement(By.tagName("h2"));
	String textTagH2 = tagMyCategory.getText();
	
	Assertions.assertTrue(textTagH2.equals("Category"));
		        

	}

}
