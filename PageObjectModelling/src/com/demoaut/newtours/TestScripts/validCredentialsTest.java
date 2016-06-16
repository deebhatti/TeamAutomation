package com.demoaut.newtours.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoaut.newtours.Pages.HomePage;



public class validCredentialsTest extends BaseTest {
	//WebDriver driver;
	
	
	@Test
	public void validLogin(){
		HomePage hp = new HomePage(driver);
		hp.login("mercury", "mercury");
		String expectedTitle = "Find a Flight: Mercury Tours:";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	
	
}
