package com.demoaut.newtours.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAFlight {
	private WebDriver driver;

	@FindBy(name = "passFirst0")
	@CacheLookup
	private WebElement firstName;
	
	@FindBy(name = "passLast0")
	@CacheLookup
	private WebElement lastName;
	
	@FindBy(name = "creditnumber")
	@CacheLookup
	private WebElement Number;
	
	@FindBy(name = "buyFlights")
	@CacheLookup
	private WebElement securePurchase;
	
	public BookAFlight(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void flightBooking(){
		firstName.sendKeys("Deepinder");
		lastName.sendKeys("Bhatti");
		Number.sendKeys("54321");
		securePurchase.click();
	}

}
